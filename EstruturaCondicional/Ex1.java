package EstruturaCondicional;

import java.util.Scanner;

public class Ex1 {

    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();

        if (x > 0) {
            System.out.println("NÃO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        ler.close();
    }
}
