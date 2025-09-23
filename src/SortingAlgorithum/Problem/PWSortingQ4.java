/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum.Problem;
import static SortingAlgorithum.BubbleSort.printArray;
/**
 * Given an array of positive and negative integers, segregate them in linear
 * time and constant space. The output should print all negative numbers,
 * followed by all positive numbers.
 * Input: [ 19, -20, 7, -4, -13, 11, -5, 3]
 * Output: [-20 -4 -13 -5 7 11 19 3 ] 
 * 
 * this problem is solved using the concept of Quick Sort
 * @author c068
 */
public class PWSortingQ4 {
    static void partion(int[] arr)
    {
      int l=0,r = arr.length-1;
        while (l < r) {
            while (arr[l] < 0) {
                l++;
            }
            while (arr[r] >= 0) {
                r--;
            }
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
    } 
    public static void main(String[] args)
    {
       int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
       partion(arr);
       printArray(arr);
    }        
}
