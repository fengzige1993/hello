package leanArray;

public class FindBiggestInSchool {
    public static void main(String[] args){
        int gradeCount = 5;
        int classCount = 25;
        int studentCount = 55;
        int [][][] allStudents = new int[gradeCount][classCount][studentCount];
        for (int i = 0;i < gradeCount; i++){
            for (int j = 0; j < classCount; j++){
                for (int k = 0; k < studentCount; k++){
                    allStudents[i][j][k] = i + j + k;
                }
            }
        }
        int biggest = 0;
        for (int i = 0; i < gradeCount; i++){
            for (int j = 0; j < classCount; j++ ){
                for (int k = 0; k < studentCount; k++){
                    if (biggest <= allStudents[i][j][k]){
                        biggest = allStudents[i][j][k];
                    }
                }
            }
        }
        System.out.println("全校最高分是："+biggest);
    }
}
