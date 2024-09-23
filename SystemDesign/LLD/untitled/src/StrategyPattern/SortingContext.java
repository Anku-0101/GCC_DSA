package StrategyPattern;

public class SortingContext {
    public SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }
    public void PerformSorting(int[] arr){
        sortingStrategy.sort(arr);
    }
}
