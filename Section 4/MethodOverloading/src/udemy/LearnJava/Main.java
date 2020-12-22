package udemy.LearnJava;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("John", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();

        calcFeetAndInchesToCentimeters(8,4.5);
        calcFeetAndInchesToCentimeters(100.5);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return  score * 1000;
    }

    // method overload
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return  0;
    }
    //Must have different amount of parameters.
    //Return type doesn't matter if amount of parameters is the same.
//    public static void calculateScore() {
//        System.out.println("No player name, no player score.");
//        return  0;
//    }

    //Method overloading challenge. Conversion of feet, inches, and centimeters

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        double centimeters = (feet * 2.54) * 12;
        centimeters += inches * 2.54;

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            System.out.println(feet + "ft "+ inches + "in is " + centimeters + "cm.");
            return 0;
        } else {
            System.out.println("Invalid input");
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        int feet = (int) inches / 12;
        double leftoverInches = inches % 12;

        if (inches >= 0) {
            System.out.println(inches + "in is equal to " + feet + "ft and " + leftoverInches + "in.");
            return calcFeetAndInchesToCentimeters(feet,leftoverInches);//return var used in method. parameters line 42
        } else {
            System.out.println("Invalid input");
            return -1;
        }

    }
}
