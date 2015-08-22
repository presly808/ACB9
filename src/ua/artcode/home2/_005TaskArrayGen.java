package ua.artcode.home2;

import ua.artcode.helper.ArrayHelper;

/**
 * Created by serhii on 22.08.15.
 */
public class _005TaskArrayGen {


    public static void main(String[] args) {
        // 5 => 68, 7, 12, 77, 10
        //      0   1   2   3  4

        // genRandomNum
        // genRandomEvenNum
        int[] arr = ArrayHelper.genRandomMas(20, 100, 200);

        ArrayHelper.showArr(arr);

        int[] mas = ArrayHelper.genMasOddEvenNums(10);

        ArrayHelper.showArr(mas);



    }
}
