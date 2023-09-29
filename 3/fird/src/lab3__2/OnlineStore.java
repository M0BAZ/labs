package lab3__2;

import java.text.DecimalFormat;

public class OnlineStore {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.0);
        Product product2 = new Product("Smartphone", 600.0);

        double totalPriceUSD = product1.getPriceUSD() + product2.getPriceUSD();
        double totalPriceEUR = CurrencyConverter.convertUSDToEUR(totalPriceUSD);

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        System.out.println("Интернет-магазин");
        System.out.println("---------------");
        System.out.println("Товар 1: " + product1.getName() + " - $" + decimalFormat.format(product1.getPriceUSD()));
        System.out.println("Товар 2: " + product2.getName() + " - $" + decimalFormat.format(product2.getPriceUSD()));
        System.out.println("Общая стоимость в USD: $" + decimalFormat.format(totalPriceUSD));
        System.out.println("Общая стоимость в EUR: €" + decimalFormat.format(totalPriceEUR));
    }
}
