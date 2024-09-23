package StrategyPattern;

public class BubbleSort implements  SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting via bubble sort");
    }
}
