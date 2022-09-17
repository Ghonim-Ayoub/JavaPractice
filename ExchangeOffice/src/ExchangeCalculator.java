public class ExchangeCalculator {
    private int currencyInitial;
    private float exchangeRate;
    private float currencyChangeable;

    public float getCurrencyChangeable(int currencyInitial, float exchangeRate) {
        currencyChangeable = currencyInitial * exchangeRate;
        return currencyChangeable;
    }

    public int getCurrencyInitial() {
        return currencyInitial;
    }

    public void setCurrencyInitial(int currencyInitial) {
        this.currencyInitial = currencyInitial;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public float getCurrencyChangeable() {
        return currencyChangeable;
    }

    public void setCurrencyChangeable(float currencyChangeable) {
        this.currencyChangeable = currencyChangeable;
    }
}
