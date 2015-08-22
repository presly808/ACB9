package ua.artcode.codingbat;

/**
 * Created by serhii on 22.08.15.
 */
public class TestHelloName {

/*
* helloName("Bob") → "Hello Bob!"	"Hello Bob"	X
helloName("Alice") → "Hello Alice!"	"Hello Alice"	X
helloName("X") → "Hello X!"	"Hello X"	X
helloName("Dolly") → "Hello Dolly!"	"Hello Dolly"	X
helloName("Alpha") → "Hello Alpha!"	"Hello Alpha"	X
helloName("Omega") → "Hello Omega!"	"Hello Omega"	X
helloName("Goodbye") → "Hello Goodbye!"	"Hello Goodbye"	X
helloName("ho ho ho") → "Hello ho ho ho!"	"Hello ho ho ho"	X
helloName("xyz!") → "Hello xyz!!"	"Hello xyz!"	X
helloName("Hello") → "Hello Hello!"	"Hello Hello"	X
*
* */
    public static void main(String[] args) {
        String[] inData = {"Bob", "Alice","X","Dolly"};

        String[] expectedData = {"Hello Bob!","Hello Alice!","Hello X!","Hello Dolly!"};

        for (int i = 0; i < inData.length; i++) {
            String actual = StringLevel1.helloName(inData[i]);
            if(expectedData[i].equals(actual)){
                System.out.printf("PASS! in %s -> expected %s, actual %s\n",
                        inData[i], expectedData[i], actual);
            } else {
                System.out.printf("FAIL! in %s -> expected %s, actual %s\n",
                        inData[i], expectedData[i], actual);
            }
        }



    }
}
