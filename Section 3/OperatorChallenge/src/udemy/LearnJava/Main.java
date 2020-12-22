package udemy.LearnJava;

public class Main {

    public static void main(String[] args) {

        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double doubleMath = (firstDouble + secondDouble) * 100.00d;
        System.out.println("doubleMath total = " + doubleMath);
        double doubleRemainder = doubleMath % 40.00d;
        System.out.println("doubleRemainder = " + doubleRemainder);
        boolean remainderBool = (doubleRemainder == 0) ? true : false;
        System.out.println("remainderBool = " + remainderBool);
        if (!remainderBool) {
            System.out.println("Got some remainder");
        }
    }
}
