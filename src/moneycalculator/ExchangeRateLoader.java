package moneycalculator;

import java.util.Date;


public class ExchangeRateLoader {
    public ExchangeRate load(Currency from, Currency to){
        return load (new Date(), from, to);
    }
    
    public ExchangeRate load (Date date, Currency from, Currency to){
        return new ExchangeRate (date, from, to,<<rate>>);
    }
}