import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracaoJogo, horaTotal;
        horaTotal = 24;

        System.out.print("Hora Inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora Final: ");
        horaFinal = sc.nextInt();

        if(horaInicial == 0 && horaFinal == 0){
            System.out.println("Duração do jogo: " + horaTotal);

        }
        
        horaTotal = horaInicial - horaFinal;
        duracaoJogo = horaTotal;
        System.out.printf("DURAÇÃO DO JOGO: " + duracaoJogo);

        sc.close();
    }
}
