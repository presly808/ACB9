package ua.artcode.week2;

import java.util.Scanner;

public class _4FillInWithCondTest {

    public static void main(String[] args) {

        // new <Type>;
        // create object
        // Java <- Somewhere
        // System.in

        Scanner sc = new Scanner(System.in);
        // create ref = create object
        System.out.println("Input size of arr");
        int size = sc.nextInt(); // wait for user input

        System.out.println("Input start");
        int start = sc.nextInt();

        System.out.println("Input step");
        int step = sc.nextInt();

        // sc.nextInt(); System.out.println("word"); Math.random();

        System.out.println(size + " " + start + " " + step);

        //CREATE ARR
        int[] mas = new int[size];

        // write into arr cells
        for(int i = 0; i < mas.length; i++){
            mas[i] = start;
            start = start + step;
        }

        // JUST OUTPUT ARR ELEMENTS
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }


    }
}
