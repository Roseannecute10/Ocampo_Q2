import java.util.Scanner;

public class Ocampo_Q2 {

    public static void main(String[] args) {
        // Input the power levels
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 power levels of creatures: ");
        int[] powerLevels = new int[10];
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt();
        }

        // Bubble Sort (Ascending)
        bubbleSort(powerLevels);
        System.out.println("Bubble Sort (Ascending):");
        printArray(powerLevels);

        // Selection Sort (Descending)
        selectionSort(powerLevels);
        System.out.println("Selection Sort (Descending):");
        printArray(powerLevels);

        // Calculate and Display Analysis
        System.out.println("Analysis:");
        System.out.println("Sum of Even Numbers: " + sumEven(powerLevels));
        System.out.println("Sum of Odd Numbers: " + sumOdd(powerLevels));
        System.out.println("Minimum Power Level: " + findMin(powerLevels));
        System.out.println("Maximum Power Level: " + findMax(powerLevels));
    }

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Sum of Even Numbers
    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Sum of Odd Numbers
    public static int sumOdd(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Find Minimum Value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Find Maximum Value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Print Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}