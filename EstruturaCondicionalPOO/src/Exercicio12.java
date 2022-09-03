import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracaoJogo = 0;

        System.out.print("Hora Inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora Final: ");
        horaFinal = sc.nextInt();

        if(horaFinal > horaInicial){
            //mesmo dia
            duracaoJogo = horaFinal - horaInicial;    
        }else {
            //virou o dia
            duracaoJogo = 24 - horaInicial + horaFinal;
        }

        System.out.println("duracao do jogo e: " + duracaoJogo);
        sc.close();
    }
}
