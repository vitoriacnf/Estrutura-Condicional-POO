import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double planoBasico = 50.00;
        double minutos = 100;
        System.out.print("Quantidade de minutos utilizados: ");
        minutos = sc.nextInt();
        if (minutos > 100) {
            double adicional = minutos - 100;
            planoBasico += adicional * 2;
        } else if (minutos < 100) {
            minutos = planoBasico;
        }
        System.out.printf("O valor a pagar: R$ %.2f", planoBasico);
        sc.close();
    }
}
