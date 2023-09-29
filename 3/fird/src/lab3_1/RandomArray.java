package lab3_1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int arraySize = 10; // Размер массива

        double[] randomArray1 = MathRandom(arraySize);
        System.out.println("Массив, сгенерированный с использованием Math.random():");
        printArray(randomArray1);

        Arrays.sort(randomArray1);

        System.out.println("\nМассив после сортировки:");
        printArray(randomArray1);

        double[] randomArray2 = RandomClass(arraySize);
        System.out.println("\nМассив, сгенерированный с использованием класса Random:");
        printArray(randomArray2);

        Arrays.sort(randomArray2);

        System.out.println("\nМассив после сортировки:");
        printArray(randomArray2);
    }

    public static double[] MathRandom(int size) {
        double[] randomArray = new double[size];

        for (int i = 0; i < size; i++) {
            randomArray[i] = Math.random();
        }

        return randomArray;
    }

    public static double[] RandomClass(int size) {
        double[] randomArray = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextDouble();
        }

        return randomArray;
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.println(value);
        }
    }
}

