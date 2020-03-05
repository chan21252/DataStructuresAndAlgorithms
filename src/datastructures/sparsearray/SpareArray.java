package datastructures.sparsearray;

/**
 * 稀疏矩阵
 *
 * @author Administrator
 * @since 2020-03-05
 */
public class SpareArray {

    /**
     * 将原始数组转为稀疏数组
     *
     * @param origin 原始数组
     * @return 稀疏数组
     */
    public int[][] compress(int[][] origin) {
        //遍历原始数组，获取有效元素个数
        int n = 0;
        for (int[] row : origin) {
            for (int item : row) {
                if (item != 0) {
                    n++;
                }
            }
        }

        //创建稀疏数组
        int[][] sparse = new int[n + 1][3];

        //填充第一行
        sparse[0][0] = origin.length;
        sparse[0][1] = origin[0].length;
        sparse[0][2] = n;

        //遍历原始数组，有效元素信息存入稀疏数组
        int count = 1;
        for (int i = 0; i < origin.length; i++) {
            for (int j = 0; j < origin[i].length; j++) {
                int item = origin[i][j];
                if (item != 0) {
                    sparse[count][0] = i;
                    sparse[count][1] = j;
                    sparse[count][2] = item;
                    count++;
                }
            }
        }

        return sparse;
    }

    /**
     * 将稀疏数组还原
     *
     * @param sparse 稀疏数组
     * @return int[][]
     */
    public int[][] decompress(int[][] sparse) {
        //读取稀疏数组的第一行，得到原始数组的大小，创建原始数组
        int[][] origin = new int[sparse[0][0]][sparse[0][1]];

        //遍历稀疏数组剩余的行，还原数组
        for (int i = 1; i < sparse.length; i++) {
            origin[sparse[i][0]][sparse[i][0]] = sparse[i][2];
        }

        return origin;
    }

    public void print2dArray(int[][] arr) {
        for (int[] row : arr) {
            for (int item : row) {
                System.out.printf("%d\t", (item));
            }
            System.out.println();
        }
    }
}
