/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 * // you has the array which is a combination of 00101001010
 * the task is place all zero stating position and all one at last position
 * 00000001111 like this.
 * solve by two pointer approuch.
 * @author Administrator
 */
public class PWProblem11 {
    static void swap(int[] arr,int i,int j)
    {
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
    }        
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 1, 0, 1, 0};
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
           if(arr[i] == 1 && arr[j] ==0)
           {
             swap(arr,i,j);
             i++;
             j--;
           } 
           else if(arr[i] == 0)
           {
              i++;
           } 
           else if(arr[j] == 1)
           {
              j--;
           } 
        }
        for (int m : arr) {
            System.out.print(m + " ");
        }
        System.out.println();
    }        
}
