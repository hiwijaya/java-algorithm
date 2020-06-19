package hiwijaya.algorithm;

import java.util.Arrays;

/**
 * @author Happy Indra Wijaya
 *
 * QuickSort
 *
 * - Also known as "partition-exchange sort".
 * - Implemented "in-place", it means no need duplicated.
 * - Complexity O(n log n) -> best part
 *
 * Step:
 * 1. Picks an element as a "pivot". It can be first, last, median, or even random element.
 * 2. Elements are grouped into 2 parts.
 *    One with elements are lower than pivot, one with element are higher than pivot.
 * 3. Sort both parts seperately by repeating 1. and 2.
 *
 * Comlexity:
 * - O(n log n) best case
 * - O(n^2) worst case
 *
 * Ref:
 * - https://www.geeksforgeeks.org/quick-sort/
 * - https://howtodoinjava.com/algorithm/quicksort-java-example/
 *
 */
public class QuickSort {

    private void sort(Integer[] arr, int low, int high){

        if(low < high){

            // pivot with last element
            int pivot = arr[high];

            int i = low - 1;
            for(int j = low; j < high; j++){
                if(arr[j] < pivot){     // asc or desc
                    i++;
                    swap(arr, i, j);
                }
            }

            // partition index
            int pi = i + 1;

            // move pivot to i+1 to make partition
            swap(arr, pi, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);

        }
    }

    private void sort2(Integer arr, int low, int high){

    }

    private void swap(Integer[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {

        QuickSort app = new QuickSort();

        Integer[] input = new Integer[] {20, 10, 35, 2, 5, 35, 40, 60, 15, 30, 5, 35};
        app.sort(input, 0, input.length - 1);

        System.out.println(Arrays.toString(input));

    }

}
