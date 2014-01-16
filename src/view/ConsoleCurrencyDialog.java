package view;

import java.util.Scanner;
import model.Currency;
import model.CurrencySet;
import view.CurrencyDialog;

public class ConsoleCurrencyDialog implements CurrencyDialog {

    private Currency currency;

    @Override
    public void show() {
        Currency[] currencies;
        while (true) {
            System.out.println("Introduce la divisa:");
            Scanner scanner = new Scanner(System.in);
            //Currency[] currencies = CurrencySet.getInstance().search(scanner.nextLine());

            if (currencies.length == 0)
                System.out.println("No se ha encontrado");
            else if (currencies.length == 1) {
                currency = currencies[0];
                break;
            } else {
                System.out.println("Mas de una divisa fue encontrada:");
                for (Currency currency : currencies)
                    new ConsoleCurrencyViewer(currency).show();
            }
        }
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

}