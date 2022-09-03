import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnit, valorPago, troco;
        int quantidade;


        System.out.printf("Preço unitário do produto: R$ ");
        precoUnit = sc.nextDouble();
        System.out.printf("Quantidade comprada: ");
        quantidade = sc.nextInt();
        System.out.printf("Dinheiro recebido: R$ ");
        valorPago = sc.nextDouble();

        troco = valorPago - (precoUnit * quantidade);

        if(troco >= 0){
            System.out.printf("TROCO: R$ %.2f", troco);
        }else{
            troco = troco* -1;
            System.out.println("Falta " + troco + " Reais para a sua compra.");
        }      


        sc.close();
    }
}
