package Day3;

import java.util.Scanner;

public class SumOfCommonElements {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int arraySize = getArraySize();
        int[] firstArray = getArrayElements(arraySize);
        int[] secondArray = getArrayElements(arraySize);
        int sum = calculateSumOfCommonElements(firstArray, secondArray);
        displayResult(sum);
        closeScanner();

    }

    public static int getArraySize() {

        System.out.println("Enter the size of the 2 arrays: ");

        int arraySize = sc.nextInt();
        return arraySize;
    }

    public static int[] getArrayElements(int size) {

        int[] outArray = new int[size];

        System.out.println("Enter " + size + " numbers for array: ");
        for (int i = 0; i < size; i++) {
            outArray[i] = sc.nextInt();
        }
        return outArray;

    }

    public static int calculateSumOfCommonElements(int[] first, int[] second) {

        int length = first.length;
        int sum = 0;

        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (first[i] == second[j]) {
                    sum+=first[i];
                }
            }
        }
        return sum;

    }

    public static void displayResult(int sum) {
        
        System.out.println(sum);

    }

    public static void closeScanner() {

        sc.close();

    }
    
}
