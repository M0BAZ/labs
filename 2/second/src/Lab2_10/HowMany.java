package Lab2_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Количество слов в введенной строке: " + wordCount);

        scanner.close();
    }

    public static int countWords(String input) {
        // Разбиваем введенную строку на слова, используя пробелы в качестве разделителей
        String[] words = input.split("\\s+");

        // Возвращаем количество слов
        return words.length;
    }
}

