package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        raio = ler.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A=%.4f%n", area);

        ler.close();

    }
}
