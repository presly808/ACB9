/**
 * Created by serhii on 09.08.15.
 */
public class _3TestDataTypeOperations {

    public static void main(String[] args) {

        // arithmetical operations
        // byte,short,int,long,float,double

        // in -> operation -> out

        // binary operations + - * / %
        int a = 5;
        int b = 2;

        int res = (a + b + 100) * (23 - 122);

        //       int / int => int
        int div = a / b;
        int mod = a % b;

        double r1 = a / (b * 1.0);

        System.out.println("div=" + div);
        System.out.println("mod=" + mod);
        System.out.println(r1);

        //System.out.println(res);
        // unary operation ++ --
        res = res + 1;

        // logical operation
        // < > <= >= == !=
        int x = 23;
        int y = 34;

        boolean r2 = x < y;
        boolean r3 = x == y;
        boolean r4 = x >= y;
        boolean r5 = x <= y;
        boolean r6 = x != y;

        // boolean operations
        // AND = &&
        // OR = ||
        // NOT = !

        boolean r7 = (x < y) && (x < 30);


        boolean isFriend = true;
        int time = 22;
        int lastTimeMovie = 23;
        int money = 200;
        int ticketPrice = 100;


        boolean canVisitCinema = (time <= lastTimeMovie) &&
                (isFriend && (money >= (ticketPrice * 2)));

        boolean canHaveNiceTime = isFriend || (money >= ticketPrice);

        System.out.println("canVisitCinema " + canVisitCinema);
        System.out.println("canHaveNiceTime " + canHaveNiceTime);





    }

}
