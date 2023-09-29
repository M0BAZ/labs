package lab4_clothes;

enum ClothingSize {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        }
        return "Взрослый размер";
    }

    public int getEuroSize() {
        return euroSize;
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    private ClothingSize size;
    private double cost;
    private String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: " + getSize().getDescription() +
                ", размер EU " + getSize().getEuroSize() +
                ", стоимость $" + getCost() +
                ", цвет: " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: " + getSize().getDescription() +
                ", размер EU " + getSize().getEuroSize() +
                ", стоимость $" + getCost() +
                ", цвет: " + getColor());
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: " + getSize().getDescription() +
                ", размер EU " + getSize().getEuroSize() +
                ", стоимость $" + getCost() +
                ", цвет: " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: " + getSize().getDescription() +
                ", размер EU " + getSize().getEuroSize() +
                ", стоимость $" + getCost() +
                ", цвет: " + getColor());
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: " + getSize().getDescription() +
                ", размер EU " + getSize().getEuroSize() +
                ", стоимость $" + getCost() +
                ", цвет: " + getColor());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: " + getSize().getDescription() +
                ", размер EU " + getSize().getEuroSize() +
                ", стоимость $" + getCost() +
                ", цвет: " + getColor());
    }
}

class Atelier {
    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) item;
                womenClothing.dressWomen();
            }
        }
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) item;
                menClothing.dressMan();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt(ClothingSize.M, 20.0, "Красный");
        Pants pants = new Pants(ClothingSize.L, 30.0, "Синий");
        Skirt skirt = new Skirt(ClothingSize.S, 25.0, "Черный");
        Tie tie = new Tie(ClothingSize.XXS, 15.0, "Серый");

        Clothes[] clothes = {tShirt, pants, skirt, tie};

        Atelier.dressWomen(clothes);
        Atelier.dressMan(clothes);
    }
}

