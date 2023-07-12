import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr));
    }

    public static int findSmallest(List<Integer> arr) {
        int small = arr.get(0);
        int small_index = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < small) {
                small = arr.get(i);
                small_index = i;
            }
        }

        return small_index;
    }

    public static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>();

        while (arr.size() > 0) {
            int small = findSmallest(arr);
            newArr.add(arr.remove(small));
        }

        return newArr;
    }
}
