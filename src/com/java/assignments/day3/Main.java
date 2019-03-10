package com.java.assignments.day3;

public class Main{
  public static void main(String[] args) {
    Sort sort = new Sort();
    int [] numbers =  sort.getIntegers();
    int [] sortedNumbers = sort.sortIntegers(numbers);
    sort.printArray(sortedNumbers);
  }
}
