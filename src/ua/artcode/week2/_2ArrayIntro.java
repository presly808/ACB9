package ua.artcode.week2;

/**
 * Created by serhii on 15.08.15.
 */
public class _2ArrayIntro {


    public static void main(String[] args) {
        // <type>[] <name> = new <type>[<size>];
        // create reference = create object(data part) in heap
        // <type>[] <name> = {<val1>,<val2>,...};

        int[] mas = new int[6];//0 0 0 0 0 0  - default values

        int mLength = mas.length; // size of array

        System.out.println("mas size " + mLength);

        mas[0] = 1;
        mas[1] = 122;
        mas[2] = 22;
        mas[3] = 34;
        mas[4] = 45;
        mas[5] = 23; // write

        System.out.println(mas[0]);
        System.out.println(mas[1]);
        System.out.println(mas[2]);
        System.out.println(mas[3]);
        System.out.println(mas[4]);
        System.out.println(mas[5]);

    }
}
