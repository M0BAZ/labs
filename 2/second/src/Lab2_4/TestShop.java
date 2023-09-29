package Lab2_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Поиск компьютера");
            System.out.println("4. Вывести список компьютеров");
            System.out.println("5. Выход");
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Ошибка! Впишете числовое значение от 1 до 5.");
            }
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите бренд компьютера: ");
                    String brand = scanner.nextLine();
                    System.out.print("Введите модель компьютера: ");
                    String model = scanner.nextLine();
                    System.out.print("Введите цену компьютера: ");
                    double price = scanner.nextDouble();
                    Computer newComputer = new Computer(brand, model, price);
                    shop.addComputer(newComputer);
                    System.out.println("Компьютер добавлен в магазин.");
                    break;
                case 2:
                    System.out.print("Введите бренд компьютера для удаления: ");
                    String removeBrand = scanner.nextLine();
                    System.out.print("Введите модель компьютера для удаления: ");
                    String removeModel = scanner.nextLine();
                    Computer computerToRemove = shop.findComputer(removeBrand, removeModel);
                    if (computerToRemove != null) {
                        shop.removeComputer(computerToRemove);
                        System.out.println("Компьютер удален из магазина.");
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                    break;
                case 3:
                    System.out.print("Введите бренд компьютера для поиска: ");
                    String searchBrand = scanner.nextLine();
                    System.out.print("Введите модель компьютера для поиска: ");
                    String searchModel = scanner.nextLine();
                    Computer foundComputer = shop.findComputer(searchBrand, searchModel);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер: " + foundComputer);
                    } else {
                        System.out.println("Компьютер не найден в магазине.");
                    }
                    break;
                case 4:
                    shop.displayComputers();
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите корректную опцию.");
                    break;
            }
        }
    }
}
