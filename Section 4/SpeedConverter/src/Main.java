public class Main {

    public static void main(String[] args) {

        double kilometersPerHour = 60.5;
        long miles = SpeedConverter.toMilesPerHour(kilometersPerHour);
        System.out.println("Mile = " + miles);

        SpeedConverter.printConversion(kilometersPerHour);
    }
}
