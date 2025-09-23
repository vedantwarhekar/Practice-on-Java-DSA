package Array;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * write a java program to print min and max element in array
 * @author Administrator
 */
public class Q2
{
    public static void main(String[] args)
    {
       int[] arr = {10,15,20,25,1};
       Arrays.sort(arr);
       System.out.println(arr[0]);
       System.out.println(arr[4]);
    }        
}
