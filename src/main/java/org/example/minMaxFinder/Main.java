package org.example.minMaxFinder;

public class Main {
    public static void main(String[] args) {
        // Integer
        Integer[] intArr = {3, 7, 1, 2, 9, 5};
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(intArr);
        System.out.print("Integer Array: ");
        printArr(intArr);
        System.out.println("Min: " + intFinder.findMin());
        System.out.println("Max: " + intFinder.findMax());
        System.out.println();

        // Double
        Double[] doubleArr = {2.4, -5.6, 7.7, 10.1, 4.0};
        MinMaxFinder<Double> doubleFinder = new MinMaxFinder<>(doubleArr);
        System.out.print("Double Array: ");
        printArr(doubleArr);
        System.out.println("Min: " + doubleFinder.findMin());
        System.out.println("Max: " + doubleFinder.findMax());
        System.out.println();

        // String
        String[] stringArr = {"Note", "Zombie", "Language", "Car", "Tractor"};
        MinMaxFinder<String> stringFinder = new MinMaxFinder<>(stringArr);
        System.out.print("String Array: ");
        printArr(stringArr);
        System.out.println("Min: " + stringFinder.findMin());
        System.out.println("Max: " + stringFinder.findMax());
    }

    private static <T> void printArr(T[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
