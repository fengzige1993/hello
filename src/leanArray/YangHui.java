package leanArray;

public class YangHui {
    public static void main(String[] args) {
        int levelCount = 10;
        int[][] yangHui = new int[levelCount][0];
        for (int i = 0; i < levelCount; i++) {
            yangHui[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    yangHui[i][j] = 1;
                } else {
                    int value = 0;
                    if (j >= 1) {
                        value += yangHui[i - 1][j - 1];
                    }
                    if (j < 1) {
                        value += yangHui[i - 1][j];
                    }
                    yangHui[i][j] = value;
                }
            }
        }
        for (int i = 0; i < levelCount; i++){
            for (int j = 0; j <= i; j++) {
                System.out.println(yangHui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
