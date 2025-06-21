package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int codItem, quantItem;
        double valor;

        codItem = ler.nextInt();
        quantItem = ler.nextInt();

        if(codItem == 1) {
            valor = quantItem * 4.00;
        } else if (codItem == 2) {
            valor = quantItem * 4.50;
        } else if (codItem == 3) {
            valor = quantItem * 5.00;
        } else if (codItem == 4) {
            valor = quantItem * 2.00;
        }
        else {
            valor = quantItem * 1.50;
        }
        System.out.printf("Total: R$%.2f%n", valor);
    }
}
