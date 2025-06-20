package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double x = ler.nextDouble();

        if(x <= 25) {
            System.out.println("Intervalo ([0,25]");
        } else if (x > 25 && x <= 50) {
            System.out.println("Interlado (25,50");
        } else if (x > 50 && x <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (x > 75 && x <=100) {
            System.out.println("Intervalo (75,100");
        }
        else {
            System.out.println("FORA INTERVALO");
        }
        ler.close();
    }
}
