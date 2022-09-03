import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, menor = 0;

        System.out.print("Primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Segundo valor: ");
        b = sc.nextInt();
        System.out.print("Terceiro valor: ");
        c = sc.nextInt();

        if (a < b && a < c) {
            menor = a;
        } else if( b < c){
            menor = b;
        } else {
            menor = c;
        }
        System.out.print("MENOR: "+ menor);
        sc.close();
    }
}
