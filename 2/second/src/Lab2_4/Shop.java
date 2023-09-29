package Lab2_4;

import java.util.ArrayList;
import java.util.List;


class Shop {
    private List<Computer> computers = new ArrayList<>();

    // Метод для добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    // Метод для поиска компьютера по бренду и модели
    public Computer findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand) && computer.getModel().equalsIgnoreCase(model)) {
                return computer;
            }
        }
        return null; // Если компьютер не найден
    }

    // Метод для вывода всех компьютеров в магазине
    public void displayComputers() {
        System.out.println("Список компьютеров в магазине:");
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
