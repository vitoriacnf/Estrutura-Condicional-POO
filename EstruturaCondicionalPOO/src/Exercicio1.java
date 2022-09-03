import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double primeiraNota, segundaNota, notaFinal;

        System.out.print("Digite a primeira nota: ");
        primeiraNota = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        segundaNota = sc.nextDouble();

        notaFinal = primeiraNota + segundaNota;
        System.out.printf("NOTA FINAL: %.1f%n", notaFinal);

        if (notaFinal < 60) {
            System.out.print("REPROVADO");
        }else{
            System.out.print("APROVADO");
        }

        sc.close();
    }
}