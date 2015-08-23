package ua.artcode.helper;

/**
 * Created by serhii on 23.08.15.
 */
public class MatrixHelper {



    public static void printMatrix(int[][] mat){

        int rowsLength = mat.length;
        //int columnsLength = mat[5].length;
        // iterate over rows
        for (int i = 0; i < rowsLength; i++) {
            //iterate over columns
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] genMatrixRandom(int rowsSize, int columnsSize, int left, int right){
        int[][] mat = new int[rowsSize][columnsSize];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = ArrayHelper.genRandomNum(left,right);
            }
        }

        return mat;

    }

    public static int[][] genMatrixRandom1(int rowsSize, int columnsSize, int left, int right){
        int[][] mat = new int[rowsSize][columnsSize];

        for (int i = 0; i < mat.length; i++) {
            mat[i] = ArrayHelper.genRandomMas(mat[i].length, left,right);
        }

        return mat;

    }
}
