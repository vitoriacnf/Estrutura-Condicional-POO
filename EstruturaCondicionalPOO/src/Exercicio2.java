import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, raizDelta, x1, x2;

        System.out.print("Coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        c = sc.nextDouble();
        System.out.println("");

        raizDelta = Math.pow(b, 2) - (4 * a * c);

        if (a == 0 || raizDelta < 0) {
            System.out.print("Esta equação não possui raízes reais");

        } else {
            x1 = (-b + Math.sqrt(raizDelta)) / (2 * a);
            x2 = (-b - Math.sqrt(raizDelta)) / (2 * a);

            System.out.printf("X1: %.4f%n", x1);
            System.out.printf("X2: %.4f%n", x2);

        }
        sc.close();
    }

}
