package hiwijaya.algorithm;

import java.util.Arrays;

/**
 * @author Happy Indra Wijaya
 *
 * BubbleSort
 *
 * - This algorithm works by repeatedly swapping the adjacent element if they are in wrong order.
 * - "in-place" algorithm, it means no need duplicated.
 * - It quite inefficient for sorting large data volumes.
 * - The algorithm needs one more whole pass(iteration) without any swap to know it is sorted.
 *
 * Step:
 * 1. go through until the last element and re-arrange its position with neighbor if they are in wrong order.
 * 2. repeat until no more element to be swap.
 *
 * Complexity:
 * - O(n2)
 *
 * ref:
 * - https://www.geeksforgeeks.org/bubble-sort/
 * - https://howtodoinjava.com/algorithm/bubble-sort-java-example/
 *
 */
public class BubbleSort {

    private void sort(Integer[] arr){

        int n = arr.length;

        for(int i=0; i<n-1; i++){

            boolean swapped = false;

            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){      // asc/desc
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }

        }

    }

    private void swap(Integer[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {

        BubbleSort app = new BubbleSort();

        Integer[] input = new Integer[] {20, 10, 35, 2, 5, 35, 40, 60, 15, 30, 5, 10};

        app.sort(input);

        System.out.println(Arrays.toString(input));

    }

}
