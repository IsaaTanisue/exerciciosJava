package EstruturaCondicional;

import java.util.Scanner;

public class Ex3 {

    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        int A, B;

        A = ler.nextInt();
        B = ler.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Múltiplos");
        }
        else {
            System.out.println("NÃO SÃO MÚLTIPLOS");
        }

        ler.close();
    }
}
