package EstruturaSequencial;

import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();
        int y = ler.nextInt();;

        int soma = x + y;

        System.out.printf("SOMA = %d%n", soma);

        ler.close();
    }
}
