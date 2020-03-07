package test.sparsearray;

import datastructures.sparsearray.SparseArray;

public class SparseArrayTest {
    public static void main(String[] args) {
        SparseArray sparseArray = new SparseArray();
        int[][] origin = new int[5][5];
        origin[1][2] = 1;
        origin[2][3] = 2;

        System.out.println("原始数组为：");
        sparseArray.print2dArray(origin);

        int[][] spare = sparseArray.compress(origin);
        System.out.println("稀疏数组为");
        sparseArray.print2dArray(spare);

        int[][] origin2 = sparseArray.decompress(spare);
        System.out.println("还原数组为");
        sparseArray.print2dArray(origin2);
    }
}
