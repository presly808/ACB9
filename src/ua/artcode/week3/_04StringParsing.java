package ua.artcode.week3;

import ua.artcode.codingbat.StringLevel1;
import ua.artcode.helper.ArrayHelper;

/**
 * Created by serhii on 23.08.15.
 */
public class _04StringParsing {

    public static void main(String[] args) {
        String names = "Kolia Vova Vova Andrey Vova Kolia";

        //

        String[] mas = names.split(" ");

        ArrayHelper.deleteDuplicates(mas);

        String res = ArrayHelper.join(mas);

        System.out.println(res);


    }
}
