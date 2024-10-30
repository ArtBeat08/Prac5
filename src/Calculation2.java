import java.util.Scanner;

public class Calculation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть значення для a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення для b: ");
        double b = scanner.nextDouble();


        System.out.print("Введіть значення для x: ");
        double x = scanner.nextDouble();

        double f_x;

        if (x < 7) {
            f_x = Math.sqrt(Math.pow(x, 3) + a);
        } else if (x == 7) {
            f_x = -b * x - 3;
        } else if (x > 7 && x < 10) {
            f_x = Math.sin(x);
        } else {
            System.out.println("x знаходиться поза областю визначення функції.");
            return;
        }


        System.out.println("f(x) = " + f_x);
    }
}
