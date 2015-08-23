package ua.artcode.week3;

/**
 * Created by serhii on 23.08.15.
 */
public class _03NullTest {

    public static void main(String[] args) {
        // only refernce types can have null

        String s1 = "Vova";
        String s2 = null;

        if(s2 != null){
            System.out.println(s2.length());
        }



        int[] arr = {1,2,3,4};
        arr = null;

        int[] mas = null;



        String[] names = new String[10];
    }
}
