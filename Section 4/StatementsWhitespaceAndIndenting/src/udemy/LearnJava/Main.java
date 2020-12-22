package udemy.LearnJava;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; // (int myVariable = 50;) is a statement
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" + // lines 12 through 14 is one statement
                " another" +
                " still more.");

        int anotherVariable = 50;
        anotherVariable++; // multiple statements can be on the same line

        // whitespace helps separate code so it is more readable and organized
        // indents in the code assists with making code readable
    }
}
