package moneycalculator;


public class MoneyDialog {
    private Money money;

    public Money getMoney() {
        return money;
    }
    
    public void execute() throws IOException{
        BufferedReader reader = new BufferedReader (new ImputStreamReader (System.in));
        System.out.println("Introducir dinero");
        String amount = reader.readLine();
        System.out.println("Divisa");
        money = new Money (Integer.valueOf(amount), CurrencySet.getinstance.search(currency));
    }
}