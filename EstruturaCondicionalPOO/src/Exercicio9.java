import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoProduto, quantidade;
        double valorAPagar;

        System.out.print("Código do produto comprado: ");
        codigoProduto = sc.nextInt();
        System.out.print("Quantidade comparada: ");
        quantidade = sc.nextInt();

        if (codigoProduto >= 1) {
            valorAPagar = codigoProduto * (quantidade * 5);
            System.out.printf("Valor a pagar: R$ %.2f", valorAPagar);

        }

        sc.close();
    }
}
