package moneycalculator;


public class CurrencySetLoader {

    public void load(){
        CurrencySet set = CurrencySet.getInstance();
        set.add(new Currency("USD", "Dólar","$")); //comprobar si lleva . o no
    }
}