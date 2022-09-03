import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario = 0, aumento = 0;
        int porcentagem;

        System.out.print("Digite o salário: R$ ");
        salario = sc.nextDouble();

        if (salario < 1000) {
            novoSalario = salario + (salario * 0.2);
            porcentagem = 20;
        } else if (salario >= 1000 && salario <= 3000) {
            novoSalario = salario + (salario * 0.15);
            porcentagem = 15;
        } else if (salario > 3000 && salario < 8000) {
            novoSalario = salario + (salario * 0.10);
            porcentagem = 10;
        } else {
            novoSalario = salario + (salario * 0.05);
            porcentagem = 5;
        }  
        
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
        aumento = novoSalario - salario;
        System.out.printf("Aumento: R$ %.2f%n", aumento);
        System.out.print("Porcentagem: "+ porcentagem + " % ");

        sc.close(); 
    }
}
