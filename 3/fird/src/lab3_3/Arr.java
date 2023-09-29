package lab3_3;

import java.util.Random;

public class Arr {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.print("Массив: ");
        printArray(array);

        boolean isIncreasing = Increasing(array);

        if (isIncreasing) {
            System.out.println("\nМассив является строго возрастающей последовательностью.");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью.");
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static boolean Increasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
