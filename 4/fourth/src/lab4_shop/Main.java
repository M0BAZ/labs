package lab4_shop;

import java.util.*;

enum ProductCategory {
    ELECTRONICS,
    CLOTHING,
    BOOKS,
    HOME_APPLIANCES
}

class Product {
    private String name;
    private double price;
    private ProductCategory category;

    public Product(String name, double price, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }
}

class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void clear() {
        items.clear();
    }

    public List<Product> getItems() {
        return items;
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class OnlineStore {
    private List<Product> products = new ArrayList<>();
    private Map<String, User> users = new HashMap<>();
    private User currentUser;
    private ShoppingCart shoppingCart = new ShoppingCart();

    public List<Product> getProducts() {
        return products;
    }

    public OnlineStore() {
        products.add(new Product("Smartphone", 500.0, ProductCategory.ELECTRONICS));
        products.add(new Product("Laptop", 1200.0, ProductCategory.ELECTRONICS));
        products.add(new Product("T-Shirt", 20.0, ProductCategory.CLOTHING));
        products.add(new Product("Jeans", 50.0, ProductCategory.CLOTHING));
        products.add(new Product("Book", 10.0, ProductCategory.BOOKS));
        products.add(new Product("Washing Machine", 300.0, ProductCategory.HOME_APPLIANCES));

        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));
    }

    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            return true;
        }
        return false;
    }

    public void logout() {
        currentUser = null;
    }

    public void displayProductCatalog() {
        System.out.println("Каталог товаров:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " (" + product.getCategory() + ")");
        }
    }

    public void displayProductsInCategory(ProductCategory category) {
        System.out.println("Товары в категории " + category + ":");
        for (Product product : products) {
            if (product.getCategory() == category) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
        }
    }

    public void addToCart(Product product) {
        shoppingCart.addItem(product);
        System.out.println(product.getName() + " добавлен в корзину.");
    }

    public void checkout() {
        if (currentUser == null) {
            System.out.println("Пользователь не аутентифицирован.");
            return;
        }

        double totalPrice = shoppingCart.calculateTotalPrice();
        System.out.println("Общая стоимость покупки: $" + totalPrice);

        if (totalPrice > 0) {
            System.out.println("Покупка успешно завершена. Спасибо за покупку!");
            shoppingCart.clear();
        } else {
            System.out.println("Корзина пуста. Выберите товары для покупки.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (store.login(username, password)) {
            System.out.println("Вход выполнен успешно.");
            store.displayProductCatalog();
            store.displayProductsInCategory(ProductCategory.ELECTRONICS);

            System.out.print("Выберите товар для покупки: ");
            int productIndex = scanner.nextInt();
            if (productIndex >= 0 && productIndex < store.getProducts().size()) {
                Product selectedProduct = store.getProducts().get(productIndex);
                store.addToCart(selectedProduct);
                store.checkout();
            } else {
                System.out.println("Товар не найден.");
            }

            store.logout();
        } else {
            System.out.println("Ошибка входа. Проверьте логин и пароль.");
        }

        scanner.close();
    }
}
