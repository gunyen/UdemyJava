package udemy.LearnJava;

public class Main {

    public static void main(String[] args) {

        byte myByte = 50;
        short myShort = 20000;
        int myInt = 50000;

        long myLongTotal = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLongTotal);

        short myShortTotal = (short)(50000 + 10 * (myByte + myShort + myInt));
        System.out.println(myShortTotal);
    }
}
