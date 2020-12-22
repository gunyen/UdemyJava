package udemy.LearnJava;

public class Main {

    public static void main(String[] args) {

        //Char primitive type
        char myChar = 'D';//can only store a single character or unicode
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00a9';
        System.out.println(myCopyrightChar);

        //Boolean primitive type
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
