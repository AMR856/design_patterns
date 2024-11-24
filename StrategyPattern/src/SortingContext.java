public class SortingContext {
    private SortingStrategy sortingStrategy;
    SortingContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    public int[] performSort(int[] array){
        return sortingStrategy.sortArray(array);
    }
}
