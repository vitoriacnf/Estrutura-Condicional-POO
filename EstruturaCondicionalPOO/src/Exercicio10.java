import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite dois números inteiros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        if (numero1 >= numero2) {
            if (numero1 % numero2 == 0) {
                System.out.print("São multiplos");
            } else {
                System.out.print("Não são multiplos");
            }
        } else {
            if (numero2 % numero1 == 0) {
                System.out.print("São multiplos");
            } else {
                System.out.print("Não são multiplos");
            }
        }

        sc.close();

    }
}
