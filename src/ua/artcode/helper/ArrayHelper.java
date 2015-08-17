package ua.artcode.helper;

/**
 * Created by serhii on 16.08.15.
 */
public class ArrayHelper {

    public static void showArr(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public static int[] genRandomMas(int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            // generate number and put into arr
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;// return array to user
    }


}
