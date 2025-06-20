package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int peca1, peca2, qtdPeca1, qtdpeca2;
        double vlrPeca1, vlrPeca2, conta;

        peca1 = ler.nextInt();
        qtdPeca1 = ler.nextInt();
        vlrPeca1 = ler.nextDouble();
        peca2 = ler.nextInt();
        qtdpeca2 = ler.nextInt();
        vlrPeca2 = ler.nextDouble();

        conta = (qtdPeca1 * vlrPeca1) + (qtdpeca2 * vlrPeca2);

        System.out.printf("VALOR A PAGAR: R$%.2f%n",conta);

        ler.close();

    }
}
