public class Calculation {
    public static void main(String[] args) {
        double a = 0.816;
        double b = 3.4;
        double c = 16.7;

        double x = Math.pow(a, 3) * Math.pow(Math.tan(Math.pow(a + b, 2)), 2) + c / Math.sqrt(a + b);
        double y = (b * Math.pow(a, 2) - c) / (Math.exp(a * c) - 1);

        System.out.println("Розраховане значення x: " + x);
        System.out.println("Розраховане значення y:" + y);
    }
}
