import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Double grausCentigrados, grausFahrenheit;
 
        System.out.println("Informe a temperatura em graus Centigrados");
        grausCentigrados = sc.nextDouble();
 
        grausFahrenheit = ((grausCentigrados * 1.8)+32);
        System.out.println("A temperatura em graus Fahrenheit é" + grausFahrenheit );
 
    
    }
}
