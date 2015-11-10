import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Created by saikris on 09/11/2015.
 */
public class Quicksort {

    private static void quicksort(Integer[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quicksort(arr, start, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, end);
        }
    }

    private static int partition(Integer[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, end);
        return i;
    }

    private static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = IntStream.range(0, 1000000).boxed().toArray(Integer[]::new);
        List<Integer> l = Arrays.asList(arr);
        Collections.shuffle(l);
        long start = System.currentTimeMillis();
        System.out.println("Started: ");
        quicksort(l.toArray(new Integer[0]), 0, arr.length - 1);
        long end = System.currentTimeMillis();
        String result = Stream.of(arr).map(i -> i + "").collect(joining(","));
        System.out.println("Sorting finished in: "+(end - start)+" seconds.");
        System.out.println(result);

    }
}
