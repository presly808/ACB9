package ua.artcode.helper;


public class ArrayHelper {

    public static int genRandomNum(int left, int right) {
        return (int) (left + (Math.random() * (right - left)));
    }

    public static int genRandomEvenNum() {
        int ran = genRandomNum(0, 100);
        if (ran % 2 == 0) {
            return ran;
        } else {
            return ran + 1;
        }
    }

    public static int[] genMasOddEvenNums(int size) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                mas[i] = ArrayHelper.genRandomEvenNum();
            } else {
                mas[i] = ArrayHelper.genRandomEvenNum() + 1;
            }
        }
        return mas;
    }

    public static void showArr(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static int[] genRandomMas(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            // generate number and put into arr
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;// return array to user
    }

    public static int[] genRandomMas(int size, int left, int right) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            // generate number and put into arr
            arr[i] = genRandomNum(left, right);
        }
        return arr;// return array to user
    }

    public static String buildStringMatrix(int rows, int columns){
        String matrix = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix += "*" + " ";
            }
            matrix += "\n";
        }
        return matrix;

    }

    public static String buildStringMatrixNum(int rows, int columns){
        String matrix = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix += String.format("(%d,%d) ",i,j);
            }
            matrix += "\n";
        }
        return matrix;

    }

    // String -> String[] = split String
    // String[] delete duplicates -> String[]
    // String[] -> String
    public static void deleteDuplicates(String[] parts) {

        for (int i = 0; i < parts.length; i++) {
            String pivot = parts[i];
            for (int j = i + 1; j < parts.length; j++) {
                String other = parts[j];
                if (pivot != null && pivot.equals(other)){
                    parts[j] = null;
                }
            }
        }
    }

    public static String join(String[] parts){
        String res = "";
        for (int i = 0; i < parts.length; i++) {
            if(parts[i] != null){
                res += parts[i] + " ";
            }
        }
        return res;
    }


}
