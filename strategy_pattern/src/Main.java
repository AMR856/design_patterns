
public class Main {
    public static void main(String[] args) {
        SortingContext quickSorter = new SortingContext(new QuickSortStrategy());
        SortingContext insertSorter = new SortingContext(new InsertionSortStrategy());
        SortingContext bubbleSorter = new SortingContext(new BubbleSortStrategy());
        int []newArray = new int[]{5, 3, 2, 1, 4, 9, 7};
        printArray(newArray);
        printArray(insertSorter.performSort(newArray));
        printArray(bubbleSorter.performSort(newArray));
    }
    public static void printArray(int[] array){
        for (int j : array) System.out.print(j + ", ");
        System.out.println();
    }
}
