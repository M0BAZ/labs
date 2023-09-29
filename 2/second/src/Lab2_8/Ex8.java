package Lab2_8;

public class Ex8 {
    public static void main(String[] args) {
        String[] arr = {"один", "два", "три", "четыре", "пять"};

        System.out.println("Исходный массив:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("\nМассив после обмена элементов:");
        printArray(arr);
    }

    // Метод для обмена элементов массива в обратном порядке
    public static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Метод для вывода элементов массива
    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
