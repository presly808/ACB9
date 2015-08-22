package ua.artcode.week3;

/**
 * Created by serhii on 22.08.15.
 */
public class _01StringIntro {

    public static void main(String[] args) {


        // create
        char[] arr = {'s', 'o', 'm', 'e'};
        String s1 = new String(arr);

        // redundant
        String s2 = new String("word");

        String s3 = "symbols of defined string";
        //           0123456
        System.out.println("s1 = " + s1 + ",s2 = " + s2 + ", s3 = " + s3);

        // %s - string; %d - byte,short,int,long; %f - float,double
        System.out.printf("s1 = %s,s2 = %s, s3 = %s\n", s1, s2, s3);

        // see string methods
        int lengthOfStr = s3.length(); //

        char ch = s3.charAt(2); // m

        System.out.printf("length %d, ch %s\n", lengthOfStr, ch);

        int indexB = s3.indexOf('b'); // 3
        int indexStr = s3.indexOf("ls"); // 5
        int noneIndex = s3.indexOf("ssdsd"); // -1

        boolean res = s3.contains("sym");

        String upper = s3.toUpperCase();
        String lower = s3.toLowerCase();

        System.out.printf("upper %s, lower %s\n", upper,lower);
        //                        [0,7)
        String part = s3.substring(0, 7);

        System.out.printf("substring %s\n", part);


        String one = "Kolia";
        String second = one;

        String third = new String("Kolia");

        // equals reference
        System.out.println(one == third);

        // equals values
        System.out.println(one.equals(third));


    }
}
