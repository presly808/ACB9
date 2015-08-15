package ua.artcode.week1;

/**
 * Created by serhii on 09.08.15.
 */
public class _4TestIfElse {

    public static void main(String[] args) {
        boolean hasFriend = false;
        int time = 20;
        int lastTimeMovie = 18;
        int money = 200;
        int ticketPrice = 2000;

        if(time >= 8 && time <= 23){
            System.out.println("Time to walk");
            if(hasFriend){
                System.out.println("With friend");
            } else {
                System.out.println("Alone");
                if(time <= lastTimeMovie && ticketPrice <= money){
                    System.out.println("To the cinema");
                    money = money - ticketPrice;
                } else {
                    System.out.println("Walk around");
                }
            }
        } else {
            System.out.println("You are sleeping now!");
        }

    }
}
