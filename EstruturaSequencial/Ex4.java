package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int number, horas;
        double valorHora, salario;

        number = ler.nextInt();
        horas = ler.nextInt();
        valorHora = ler.nextDouble();

        salario = valorHora * horas;

        System.out.printf("NUMBER = %d%n",number);
        System.out.printf("SALARY = U$%.2f", salario);

        ler.close();
    }
}
