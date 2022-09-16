public class ExchangeCalculator {
    int currencyInitial;
    float exchangeRate;
    float currencyChangeable;

    public float getCurrencyChangeable(int currencyInitial, float exchangeRate) {
        currencyChangeable = currencyInitial * exchangeRate;
        return currencyChangeable;
    }
}
