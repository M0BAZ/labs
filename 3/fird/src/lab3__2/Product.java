package lab3__2;

public class Product {
    private String name;
    private double priceUSD;

    public Product(String name, double priceUSD) {
        this.name = name;
        this.priceUSD = priceUSD;
    }

    public String getName() {
        return name;
    }

    public double getPriceUSD() {
        return priceUSD;
    }
}
