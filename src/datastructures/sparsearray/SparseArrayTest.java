package datastructures.sparsearray;

public class SparseArrayTest {
    public static void main(String[] args) {
        SpareArray spareArray = new SpareArray();
        int[][] origin = new int[5][5];
        origin[1][2] = 1;
        origin[2][3] = 2;

        System.out.println("原始数组为：");
        spareArray.print2dArray(origin);

        int[][] spare = spareArray.compress(origin);
        System.out.println("稀疏数组为");
        spareArray.print2dArray(spare);

        int[][] origin2 = spareArray.decompress(spare);
        System.out.println("还原数组为");
        spareArray.print2dArray(origin2);
    }
}
