package org.example.minMaxFinder;

public class MinMaxFinder<T extends Comparable<T>> {
    private T[] elements;

    public MinMaxFinder(T[] elements) {
        if(elements == null || elements.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        this.elements = elements;
    }

    public T findMin() {
        T min = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].compareTo(min) < 0) {
                min = elements[i];
            }
        }
        return min;
    }

    public T findMax() {
        T max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].compareTo(max) > 0) {
                max = elements[i];
            }
        }
        return max;
    }
}
