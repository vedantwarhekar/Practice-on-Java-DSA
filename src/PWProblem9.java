/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 * given q quries,cheack if the given number present in the array or not.
 *   note:- value of the element in the is less than 10 to the power5. 
 * explination:-
 *     this is simple problem but while writing the solution we need to focus on time c
 * complexity suppose the array contain only 5 values and we need have 100 quries than
 * that's why we need to create new frequancy array;
 * @author Administrator
 */
public class PWProblem9 
{
    static int[] frequancy(int[] arr)
    {
       int [] freq = new int[100005];
       for(int i=0;i<arr.length;i++)
       {
          freq[arr[i]] = freq[arr[i]] +1 ;
       } 
       return freq;
    }        
    public static void main(String[] args)    
    {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<arr.length;i++)
     {
        arr[i] = sc.nextInt();
     }
     int freq[] = frequancy(arr);
     
     int q = sc.nextInt();
     while(q > 0)
     {
       System.out.print("Entre the element to find:-");
       int num = sc.nextInt();
       if(freq[num]>0)
       {
          System.out.println("Yes");
       }else
       {
         System.out.println("No");
       } 
       q--;
     }    
  }
}
