package hiwijaya.algorithm;

import java.util.Arrays;

/**
 * @author Happy Indra Wijaya
 *
 * QuickSort
 *
 * - Also known as "partition-exchange sort".
 * - Is a "divide and conquer algorithm".
 * - "in-place" algorithm, it means no need duplicated.
 * - In QuickSort, partition is the key process.
 * - There are two partition scheme in QuickSort, Lomuto's and Hoare's partition scheme.
 * - Hoare's partition scheme used two indexes move toward each other until an inversion is found.
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

    private void lomutoPartitionSort(Integer[] arr, int low, int high){

        // break the loop
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

            lomutoPartitionSort(arr, low, pi-1);
            lomutoPartitionSort(arr, pi+1, high);

        }
    }

    private void hoarePartitionSort(Integer[] arr, int low, int high){

        // break the loop
        if(low >= high){
            return;
        }

        // get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low;
        int j = high;
        while(i <= j){

            // check until all values on left side array are lower than pivot
            while(arr[i] < pivot){      // asc/desc
                i++;
            }

            // check until all values on right side array are greater than pivot
            while(arr[j] > pivot){      // asc/desc
                j--;
            }

            // do swap and move iterators on both side
            if(i <= j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // do same operation as above recursively to sort two sub arrays
        if(low < j){
            hoarePartitionSort(arr, low, j);
        }
        if(high > i){
            hoarePartitionSort(arr, i, high);
        }

    }

    private void swap(Integer[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


    public static void main(String[] args) {

        QuickSort app = new QuickSort();

        Integer[] input = new Integer[] {20, 10, 35, 2, 5, 35, 40, 60, 15, 30, 5, 10};

        app.lomutoPartitionSort(input, 0, input.length - 1);
        app.hoarePartitionSort(input, 0, input.length - 1);

        System.out.println(Arrays.toString(input));

    }

}
