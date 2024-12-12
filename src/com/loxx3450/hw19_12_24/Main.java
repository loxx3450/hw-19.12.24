package com.loxx3450.hw19_12_24;

import com.loxx3450.hw19_12_24.task67.Array;

public class Main {
  public static void main(String[] args) {
    int[] test_arr = new int[]{8, 2, 4};

    Array array = new Array(test_arr);

    System.out.println("Max: " + array.max());
    System.out.println("Min: " + array.min());
    System.out.println("Average: " + array.avg());

    System.out.println("Array: " + array);

    array.sortAsc();
    System.out.println("Ordered ascending: " + array);

    array.sortDesc();
    System.out.println("Ordered descending: " + array);
  }
}