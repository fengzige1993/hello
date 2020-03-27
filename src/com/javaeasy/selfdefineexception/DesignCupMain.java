package com.javaeasy.selfdefineexception;

public class DesignCupMain {
    //因为CapacityTooBigException已经被try-catch语句处理掉了，所以无需再用throws 语句抛出
    public static void main(String[] args){
        if (args.length !=1){
            System.out.println("请将杯子的容积作为参数传递给main()方法！");
            return;
        }

        Cup cup = new Cup();
        CupDesigner cupDesigner = new CupDesigner(cup);
        int capacity = Integer.valueOf(args[0]);
        //args[0] 就是数组的第一个元素，main()方法中会传递一个参数，所以就用args[0]表示一个参数
        //因为是字符串数组，所以将数组中的元素拿出来转换为int类型的数值
        System.out.println("开始设计杯子，杯子的容积为："+capacity);
        try{
            cupDesigner.designCupCapacity(capacity);
        } catch (CapacityTooBigException e) {
            System.out.println("捕捉到了CapacityTooBigException 类型的异常。异常以信息如下。");
            System.out.println(e.getMessage());
            System.out.println("尝试使用最大的杯子容积设计杯子。");
            try {
                cupDesigner.designCupCapacity(10000);
            } catch (CapacityTooBigException e1){

            } catch (CapacityTooSmallException e1){

            }
        } catch (CapacityTooSmallException e){
            System.out.println("捕捉到了CapacityTooSmallException类型的异常。异常信息如下。");
            System.out.println(e.getMessage());
            System.out.println("尝试使用最小的杯子容积设计杯子：");
            try {
                cupDesigner.designCupCapacity(0);
            } catch (CapacityTooBigException e1){

            } catch (CapacityTooSmallException e1){

            }
        }



        System.out.println("设计杯子结束。");
    }
}
