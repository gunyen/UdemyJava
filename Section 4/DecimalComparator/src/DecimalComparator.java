public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {

        // each zero indicates a decimal point
        if ((int) (numberOne * 1000) == (int) (numberTwo * 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
