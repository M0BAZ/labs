package lab4_1_Ts;

public class Main {
    public static void main(String[] args){
        Car BMW = new Car("Бумер", 5, 34.5, 200, 30.6);
        Plane plane = new Plane("Саломёт", 5, 34.5, 200, 30.6);
        Train train = new Train("Паровозик Томас", 5, 34.5, 200, 30.6);
        Ship ship = new Ship("Титаник", 5, 34.5, 200, 30.6);
        printinfoabout(BMW);
        printinfoabout(plane);
        printinfoabout(train);
        printinfoabout(ship);


    }
    public static void printinfoabout(Transport ts){
        System.out.println(ts);
        System.out.println("Время перевозки пассажиров: " + ts.calculatePassengerTime());
        if(ts.getname().equals("Титаник")){
            System.out.print("Стоимость перевозки пассажиров: " + ts.calculatePassengerCost());
            System.out.println(" На самом деле, стоимость = Жизнь");
        }else{System.out.println("Стоимость перевозки пассажиров: " + ts.calculatePassengerCost());}
        System.out.println("Время перевозки грузов: " + ts.calculateCargoTime());
        System.out.println("Стоимость перевозки грузов: " + ts.calculateCargoCost());
        System.out.println(" ");
    }
}

// Абстрактный класс Транспортное средство
abstract class Transport {
    private String name;


    public Transport(String name) {
        this.name = name;


    }

    public String getname() {
        return name;
    }

    // Метод для подсчета времени перевозки пассажиров
    public abstract double calculatePassengerTime();

    // Метод для подсчета времени перевозки грузов
    public abstract double calculateCargoTime();

    // Метод для подсчета стоимости перевозки пассажиров
    public abstract double calculatePassengerCost();

    // Метод для подсчета стоимости перевозки грузов
    public abstract double calculateCargoCost();

    @Override
    public String toString() {
        return "Это " + getname();
    }
}

// Подкласс Автомобиль
class Car extends Transport {
    private int speed;
    private double costPerKilometer;
    private double cargo_weight;
    private int passengers;

    public Car(String name, int passengers, double cargo_weight, int speed, double costPerKilometer) {
        super(name);
        this.passengers = passengers;
        this.cargo_weight = cargo_weight;
        this.speed = speed;
        this.costPerKilometer = costPerKilometer;
    }

    @Override
    public double calculatePassengerTime() {
        return passengers * 100.0 / speed;
    }

    @Override
    public double calculateCargoTime() {
        return cargo_weight * 10.0 / speed;
    }

    @Override
    public double calculatePassengerCost() {
        return passengers * costPerKilometer;
    }

    @Override
    public double calculateCargoCost() {
        return cargo_weight * costPerKilometer;
    }

}

class Plane extends Transport {
    private int speed;
    private double costPerKilometer;
    private double cargo_weight;
    private int passengers;

    public Plane(String name, int passengers, double cargo_weight, int speed, double costPerKilometer) {
        super(name);
        this.passengers = passengers;
        this.cargo_weight = cargo_weight;
        this.speed = speed;
        this.costPerKilometer = costPerKilometer;
    }

    @Override
    public double calculatePassengerTime() {
        return passengers * 10.0 / speed;
    }

    @Override
    public double calculateCargoTime() {
        return cargo_weight * 7.0 / speed;
    }

    @Override
    public double calculatePassengerCost() {
        return passengers * costPerKilometer;
    }

    @Override
    public double calculateCargoCost() {
        return cargo_weight * costPerKilometer;
    }
}

class Train extends Transport {
    private int speed;
    private double costPerKilometer;
    private double cargo_weight;
    private int passengers;

    public Train(String name, int passengers, double cargo_weight, int speed, double costPerKilometer) {
        super(name);
        this.passengers = passengers;
        this.cargo_weight = cargo_weight;
        this.speed = speed;
        this.costPerKilometer = costPerKilometer;
    }

    @Override
    public double calculatePassengerTime() {
        return passengers * 59.6 / speed;
    }

    @Override
    public double calculateCargoTime() {
        return cargo_weight * 6.6 / speed;
    }

    @Override
    public double calculatePassengerCost() {
        return passengers * costPerKilometer;
    }

    @Override
    public double calculateCargoCost() {
        return cargo_weight * costPerKilometer;
    }
}

class Ship extends Transport {
    private int speed;
    private double costPerKilometer;
    private double cargo_weight;
    private int passengers;

    public Ship(String name, int passengers, double cargo_weight, int speed, double costPerKilometer) {
        super(name);
        this.passengers = passengers;
        this.cargo_weight = cargo_weight;
        this.speed = speed;
        this.costPerKilometer = costPerKilometer;
    }

    @Override
    public double calculatePassengerTime() {
        return passengers * 47.0 / speed;
    }

    @Override
    public double calculateCargoTime() {
        return cargo_weight * 8.0 / speed;
    }

    @Override
    public double calculatePassengerCost() {
        return passengers * costPerKilometer;
    }

    @Override
    public double calculateCargoCost() {
        return cargo_weight * costPerKilometer;
    }
}