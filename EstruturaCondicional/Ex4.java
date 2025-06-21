package EstruturaCondicional;

import java.util.Scanner;

public class Ex4 {

    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        int horaInicial, horaFinal, horaJogada;

        horaInicial = ler.nextInt();
        horaFinal = ler.nextInt();

        if(horaInicial < horaFinal) {
            horaJogada = horaFinal - horaInicial;
        }
        else {
            horaJogada = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + horaJogada);

        ler.close();
    }
}
