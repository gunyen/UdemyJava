public class SecondsAndMinutes {

    private  static final String INVALID_VALUE_MESSAGE = "Invalid value";//constant

    public static void main(String[] args) {

        getDurationString(65,45);
        getDurationString(3945);
    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes >= 0 && seconds >= 0) {// && seconds <= 59

            int hours = ((seconds / 60) + minutes) / 60;
            int remMin = ((seconds / 60) + minutes) % 60;
            int remSec = seconds % 60;
            System.out.println(hours + "h " + remMin + "m " + remSec + "s");
            return "Valid value";
        } else {
            System.out.println("Invalid value");
            return INVALID_VALUE_MESSAGE;
        }


    }

    public static String getDurationString(int seconds) {

        if(seconds >= 0) {

            int minutes = seconds / 60;
            int remSec = seconds % 60;
            return getDurationString(minutes,remSec);
        } else {
            System.out.println("Invalid value");
            return INVALID_VALUE_MESSAGE;
        }


    }
}
