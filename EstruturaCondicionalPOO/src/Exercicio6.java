import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double glicose;

        System.out.print("Digite a medida da glicose: ");
        glicose = sc.nextDouble();

        if (glicose <= 100) {
            System.out.print("normal");

        } else if (glicose > 100 && glicose <= 140) {
            System.out.print("elevado");

        } else
            System.out.print("diabetes");
        {

        }

        sc.close();

    }
}
