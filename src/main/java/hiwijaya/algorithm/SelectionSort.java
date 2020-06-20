package hiwijaya.algorithm;

import java.util.Arrays;

/**
 * @author Happy Indra Wijaya
 *
 * SelectionSort
 *
 * - This algorithm works by repeatedly find and select the lowest/highest element from un-sorted section and moves it
 *   to the endof the sorted section.
 * - "in-place" algorithm, it means no need duplicated.
 * - Good thing in SelectionSort is minimizing the number of swaps with each iteration.
 *
 * Step:
 * 1. find the element with the lowest/highest comparable order
 * 2. place the found element to the end of the sorted section
 * 3. repeat until no more elements left in un-sorted section
 *
 * Complexity:
 * O(n2)
 *
 * Ref:
 * - https://www.geeksforgeeks.org/selection-sort/
 * - https://howtodoinjava.com/algorithm/selection-sort-java-example/
 *
 */
public class SelectionSort {

    private void sort(Integer[] arr){

        int n = arr.length;

        for(int i=0; i<n-1; i++){

            int pivotIndex = i;

            // find the lowest/highest index element
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[pivotIndex]){     // asc/desc
                    pivotIndex = j;
                }
            }

            swap(arr, i, pivotIndex);
        }
    }

    private void swap(Integer[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {

        SelectionSort app = new SelectionSort();

        Integer[] input = new Integer[] {20, 10, 35, 2, 5, 35, 40, 60, 15, 30, 5, 10};

        app.sort(input);

        System.out.println(Arrays.toString(input));

    }

}
