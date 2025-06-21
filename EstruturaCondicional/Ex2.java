package EstruturaCondicional;

import java.util.Scanner;

public class Ex2 {

    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();

        if(x % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        ler.close();
    }
}
