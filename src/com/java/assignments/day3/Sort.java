package com.java.assignments.day3;

import java.util.Scanner;

public class Sort {
  private int numbers[];

  public int [] getIntegers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of Elements");
    int arraySize = scanner.nextInt();
    int [] numbers = new int[arraySize];
    for(int elementPosition = 0; elementPosition < numbers.length; elementPosition++) {
      numbers[elementPosition] = scanner.nextInt();
    }
    return numbers;
  }

  public int[] sortIntegers(int[] numbers) {
    for(int i = 0; i < numbers.length; i++) {
      for(int j = 0; j < numbers.length-1; j++) {
        if(numbers[j] < numbers[j+1]) {
          int temp = numbers[j];
          numbers[j] = numbers[j+1];
          numbers[j+1] = temp;
        }
      }
    }
    return numbers;
  }

  public void printArray(int [] list) {
    for(int i = 0; i < list.length; i++) {
      System.out.println(list[i]);
    }
  }
}


