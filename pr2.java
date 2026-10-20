
public class pr2 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;

        double c = 2.1;
        double d = 0.55;
        double f = 5.9;

        double denominator = (a * d) - (b * c);

        double x = ((e * d) - (b * f)) / denominator;
        double y = ((a * f) - (e * c)) / denominator;

        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);
    }
}
