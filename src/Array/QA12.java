/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;
// Q count occurance of the numbre

/**
 *
 * @author c068
 */
public class QA12 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 5, 6, 8, 8, 2, 2, 6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println("the occurance of the "+arr[i]+" is "+count);
            i+=(count-1);
        }

    }
}
