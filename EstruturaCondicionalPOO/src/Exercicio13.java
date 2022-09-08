import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X, Y;
        X = sc.nextDouble();
        Y = sc.nextDouble();

        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if (X == 0 && Y != 0) {
            System.out.println("Eixo Y");
        } else if (X != 0 && Y == 0) {
            System.out.println("Eixo X");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else if (X < 0 && Y < 0) {
            System.out.println("Q3");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        }
        sc.close();
    }

}
