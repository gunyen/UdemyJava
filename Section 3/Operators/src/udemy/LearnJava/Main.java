package udemy.LearnJava;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;//1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;// 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;// 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;//20 . 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;// the reamainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);


        /*
        * Abbreviating operators
        */

        // result = result + 1
        result++;//1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        //result = result - 1
        result--;//2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;//1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2 ; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // result = result % 3
        result %= 3;
        System.out.println("8 % 3 = " + result);


        /*
        * if-then statement
        */

        boolean isAlien = true;
        if (isAlien == false) {//no semi colon
            System.out.println("It is not an alien!");
            System.out.println("and I am scared of aliens");
        }
        else if (isAlien == true) {
            System.out.println("It is an alien!");
        }

        int topScore = 80;
        if (topScore <= 100) {// (==) (!=) (>) (>=) (<) (<=)
            System.out.println("You got the high score!");
        }

        //Logical AND
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater then second top score and less than 100");
        }

        /*
        *Logical OR Operator
        */
        //Logical OR
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }


        /*
        * Assignment Operator VS Equals to Operator
        */
        //testing not claiming a value
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        //boolean value must use correct operator
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not suppose to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
