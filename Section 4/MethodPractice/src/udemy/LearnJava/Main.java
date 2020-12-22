package udemy.LearnJava;

public class Main {

    public static void main(String[] args) {

        int result = calc(150, 100);
        System.out.println("The first number plus the second number is " + result);
    }

    public static int calc(int numberOne, int numberTwo) {

        int result = numberOne + numberTwo;
        return result;
    }

    
}
