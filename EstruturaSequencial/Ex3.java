package EstruturaSequencial;

import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();

        diferenca = A * B - C * D;

        System.out.printf("DIFERENÇA = %d%n", diferenca);

        ler.close();
    }
}
