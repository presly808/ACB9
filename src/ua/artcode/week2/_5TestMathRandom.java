package ua.artcode.week2;

/**
 * Created by serhii on 16.08.15.
 */
public class _5TestMathRandom {

    public static void main(String[] args) {


        // [0...1) double
        double random = Math.random();
        System.out.println(random);

        double ran = random * 100; // 0..99
        System.out.println(ran);

        System.out.println();

        // cast -> change type -> down casting
        // upcasting -> double d = 78;
        // int a = 23.3;

        int intNum = (int) ran;


        System.out.println(intNum);


        int r = (int)(Math.random() * 100);
//        System.out.println(r);



    }
}
