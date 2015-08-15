package ua.artcode.week2;

/**
 * Created by serhii on 15.08.15.
 */
public class _3ArrayWithLoop {


    public static void main(String[] args) {
        // array + loop

        int[] array = new int[50];

        /*array[0] = 1;
            array[1] = 1;
            array[2] = 1;
            array[3] = 1;
            array[4] = 1;
        */
        // fill in arr
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        for(int i = 0, val = array.length; i < array.length; i++, val--){
            array[i] = val;
        }

        for(int i = 0; i < array.length; i++){
            array[i] = array.length - i;
        }

        // print all arr
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
