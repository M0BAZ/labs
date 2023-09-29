package lab3__2;

public class CurrencyConverter {
    private static final double USD_TO_EUR = 0.85;

    public static double convertUSDToEUR(double amountInUSD) {
        return amountInUSD * USD_TO_EUR;
    }
}
