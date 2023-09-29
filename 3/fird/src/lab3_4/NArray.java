package lab3_4;

import java.util.Random;
import java.util.Scanner;

public class NArray {
    public static void main(String[] args) {
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.print("Введите размер массива (натуральное число больше 0): ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Введите размер массива (натуральное число больше 0): ");
                    scanner.next();
                }
                n = scanner.nextInt();
            } while (n <= 0);
        }
        int[] array = RandomArray(n);
        System.out.println("Сгенерированный массив:");
        printArray(array);

        int[] evenArray = EvenNumbers(array);
        System.out.println("\nМассив из четных элементов:");
        printArray(evenArray);
    }

    public static int[] RandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size + 1); // Генерируем числа в диапазоне [0; n]
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static int[] EvenNumbers(int[] array) {
        int evenCount = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int index = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                evenArray[index] = value;
                index++;
            }
        }

        return evenArray;
    }
}
