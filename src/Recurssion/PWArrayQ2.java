/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * // print maximum element of array using recurssion
 * @author c068
 */
public class PWArrayQ2 
{
    static int findmaximum(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smallvalue = findmaximum(arr, idx + 1);
        return Math.max(arr[idx], smallvalue);
    }
    static int findMaximum(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int small_Value = findMaximum(arr, idx + 1);
        return Math.max(arr[idx], small_Value);
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 4, 2, 7, 5, 6, 8, 2, 4, 0};
        System.out.println(findMaximum(arr, 0));
    }
}
