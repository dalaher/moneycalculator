package model;

import model.Currency;
import java.util.ArrayList;
import java.util.HashSet;


public class CurrencySet extends HashSet<Currency>{
    private CurrencySet(){}
    private static CurrencySet instance;

    public static CurrencySet getInstance() {
        if (instance == null)
            instance = new CurrencySet();
        return instance;
    }
    public Currency search (String code){
        for (Currency currency: instance)
            if (code.equals(currency.getCode()))
                return currency;
        return null;
    }
    
    public Currency getCurrency(String code) {
        for (Currency currency : this)
            if (code.equals(currency.getCode()))
                return currency;
        return null;
    }
    
    public Currency add (String code, String name, String symbol){
        return new Currency(code, name, symbol);   
    }
}