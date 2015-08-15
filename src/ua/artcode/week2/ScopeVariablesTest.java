package ua.artcode.week2;

/**
 * Created by serhii on 15.08.15.
 */
public class ScopeVariablesTest {


    // Where am i?
    // What can i take? (scope variables, blocks)
    public static void main(String[] args) {

        int i = 23;

        i++;

        //c++

        if(true){
            int b = 89;
            i++;
            if(true){
                i++;
                int c = 89;
            }

            //c++;
        }

        //b++;

        int c = 56;
    }
}
