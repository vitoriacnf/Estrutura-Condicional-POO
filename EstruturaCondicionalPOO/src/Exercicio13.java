import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2;

        System.out.println("Digite dois números inteiros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();


        sc.close();


    }
}
