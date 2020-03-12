package chapter1.ex1_1_11;

/**
 * Print2DMatrix
 *
 * @author Chan
 * @since 2020/3/12
 */
public class Matrix {
    public static void main(String[] args) {
        boolean[][] booleans = {
                {true, false, false, false},
                {false, true, false, false},
                {false, false, true, false},
                {false, false, false, true}
        };

        printMatrix(booleans);
    }

    /**
     * 打印布尔矩阵
     *
     * @param a boolean[][]
     */
    public static void printMatrix(boolean[][] a) {
        //打印列号
        System.out.print(" ");
        for (int i = 0; i < a[0].length; i++) {
            System.out.printf("%d ", (i + 1));
        }
        System.out.println();

        //遍历数组的行
        for (int i = 0; i < a.length; i++) {
            boolean[] row = a[i];
            //打印行号
            System.out.printf("%d ", (i + 1));
            //遍历每一行的元素
            for (int j = 0; j < row.length; j++) {
                if (row[j]) {
                    System.out.printf("%s ", "*");
                } else {
                    System.out.printf("%s ", " ");
                }
            }
            System.out.println();
        }
    }
}
