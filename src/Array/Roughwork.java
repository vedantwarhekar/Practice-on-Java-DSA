/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.*;

public class Roughwork
{
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void printTarget(int[] arr, int target){
        for(int i =0; i < target; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int totalSum(int[] arr){
        int totalSum = 0;
        for(int i =0; i < arr.length; i++){
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }
    static boolean findPrimeNumebr(int num){
        if(num <= 1) return false;
        for (int i =2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int uniqueindex = 0;
        int[] unique = new int[arr.length];

        for(int i =0; i < arr.length; i++)
        {
            boolean isDuplicate = false;
           for(int j =0; j < uniqueindex; j++){
               if(arr[i] == arr[j]){
                   isDuplicate = true;
               }
           }
           if(!isDuplicate){
               arr[uniqueindex++] = arr[i];
           }
        }


        printTarget(arr,uniqueindex);
    }
}
