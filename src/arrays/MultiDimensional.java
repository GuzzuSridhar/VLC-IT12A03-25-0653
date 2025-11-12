package arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        // 5x5 array

        int[][] twod = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        for (int i = 0; i < twod.length; i++) {
            for (int j = 0; j < twod.length; j++) {
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
        }

    }
}
