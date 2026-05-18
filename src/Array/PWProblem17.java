/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.HashSet;
import java.util.Scanner;
/**
 *  Q1 - Given an array sorted in increasing order of size n and an integer x, 
 * find if there exists a pair in the array whose absolute difference is exactly x.(n>1)
 * 
 * @author Administrator
 */
public class PWProblem17 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,10,15,20,26};
        int x = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num-x) || set.contains(num+x)){
                System.out.println("true");
                break;
            }
            set.add(num);
        }
    }        
}
