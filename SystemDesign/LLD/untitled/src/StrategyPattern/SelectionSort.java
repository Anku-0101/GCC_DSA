package StrategyPattern;

public class SelectionSort implements SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting via selection sort");
    }
}
