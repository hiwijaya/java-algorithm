package hiwijaya.algorithm;

import java.util.Arrays;

/**
 * @author Happy Indra Wijaya
 *
 * InsertionSort
 *
 * - This algorithm works by repeatedly takes the next element from the un-sorted section and
 *   inserts it into the sorted section at the correct position.
 * - The idea behind this algorithm is like ordering cards in your hand.
 * - "in-place" algorithm, it means no need duplicated.
 * - ONLINE algorithm. Can sort a list as it receives it.
 * - Used for small data input sets and efficient for data with almost sorted.
 *
 * Step:
 * 1. take an element sequentially.
 * 2. insert the element into the sorted section at the correct position based on the comparable property.
 * 3. repeat until no more element in the uncorrect position
 *
 * Complexity:
 * - O(n2)
 *
 * Ref:
 * - https://www.geeksforgeeks.org/insertion-sort/
 * - https://howtodoinjava.com/algorithm/insertion-sort-java-example/
 *
 */
public class InsertionSort {

    private void sort(Integer[] arr){

        int n = arr.length;

        for(int i=1; i<n; i++){

            int pivot = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > pivot){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = pivot;
        }
    }

    public static void main(String[] args) {

        InsertionSort app = new InsertionSort();

        Integer[] input = new Integer[] {20, 10, 35, 2, 5, 35, 40, 60, 15, 30, 5, 10};

        app.sort(input);

        System.out.println(Arrays.toString(input));

    }

}
