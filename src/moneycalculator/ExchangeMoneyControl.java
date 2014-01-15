package moneycalculator;


public class ExchangeMoneyControl {
    public Money readMoney(){
        MoneyDialog dialog = new MoneyDialog();
        dialog.execute();
        return dialog.getMoney();
    }
    
    Currency readCurrency(){
        CurrencyDialog dialog = new CurrencyDialog();
       // dialog.execute();
        return dialog.getCurrency();
    }
}