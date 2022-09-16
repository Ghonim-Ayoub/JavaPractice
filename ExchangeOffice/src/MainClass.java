public class MainClass {
    public static void main (String... args){
        ExchangeCalculator exchangeCalculator = new ExchangeCalculator();
        System.out.println(exchangeCalculator.getCurrencyChangeable(1500,1.22f));
    }
}
