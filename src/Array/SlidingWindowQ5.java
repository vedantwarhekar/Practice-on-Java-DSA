package Array;

import java.util.LinkedList;
import java.util.Queue;

// First Negative Number in Every Window of Size K
// Problem
// Print first negative number in every window of size k
// Array = [12, -1, -7, 8, -15, 30, 16, 28]
// K = 3
// output:- -1 -1 -7 -15 -15 0
public class SlidingWindowQ5 {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        Queue<Integer> queue = new LinkedList<>();
        int start = 0, end = 0;
        while (end < arr.length){
            // Add negative numbers to queue
            if(arr[end] < 0){
                queue.add(arr[end]);
            }
            // window size is less than k
            if(end-start+1 < k){
                end++;
            }else{
                if(queue.isEmpty()){
                    System.out.print("0 ");
                }else {
                    System.out.print(queue.peek()+" ");
                }

                // Remove element going out of window
                if(!queue.isEmpty() && arr[start] == queue.peek()){
                    queue.poll();
                }
                end++;
                start++;
            }
        }
        System.out.println();
    }
}
