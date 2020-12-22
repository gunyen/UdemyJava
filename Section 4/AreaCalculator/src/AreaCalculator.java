public class AreaCalculator {

    public static double area(double radius) {

        if(radius < 0) {
            return -1.0d;
        }
        double areaCircle = radius * radius * Math.PI;
        System.out.println(areaCircle);
        return areaCircle;
    }

    public static double area(double x, double y) {

        if(x < 0 || y < 0) {
            return -1.0;
        }
        double areaRectangle = x * y;
        System.out.println(areaRectangle);
        return areaRectangle;
    }
}
