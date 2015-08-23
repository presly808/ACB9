package ua.artcode.week3;

import ua.artcode.helper.*;

public class _05MatrixIntro {

    public static void main(String[] args) {
        int[] mas0 = {1, 2, 3, 5};
        int[] mas1 = {23, 45, 2, 9};
        int[] mas2 = {21, 8, 7, 3};
        int[] mas3 = {11, 89, 3, 99};
        /*
        *   0 1 2 3 4
        * 0 0 0 0 0 0
        * 1 0 0 0 0 0
        * 2 0 0 0 0 0
        * 3 0 0 0 0 0
        * 4 0 0 0 0 0
        *
        * */

        int[][] matrix = new int[5][5];
        int[] row0 = matrix[0];
        int cell01 = matrix[0][1];


        int[][] mat2 = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};

        MatrixHelper.printMatrix(mat2);

        int[][] mat3 = {{1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}};

        int[][] mat4 = {{1, 2, 4, 5, 6},
                {3, 2},
                {2, 4, 6}};

        String[][] table = {{"Vasia", "Kolia"},
                            {"Cinema", "Pub"},
                            {"Morning", "Evening"}
                            };


        String some = table[2][1];
        String[] places = table[1];

        table[0][0] = "Olesia";

    }

}
