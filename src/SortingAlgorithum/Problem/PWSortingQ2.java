/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;

/**
 * given a string of array you need to sort that array into lexographical order 
 * using selection sort
 *  Input :- {"papaya","lime","mango","orange","apple"};
 *  output :- 
 * @author c068
 */
public class PWSortingQ2 {
    static void sortFruits(String[] fruits)
    {
        int n = fruits.length;
        for(int i=0;i<n-1;i++)
        {
           int min_val = i;
           for(int j=i+1;j<n;j++)
           {
             if(fruits[j].compareTo(fruits[min_val]) < 0)
             {
                min_val = j;
             }    
           }   
           String temp = fruits[i];
           fruits[i] = fruits[min_val];
           fruits[min_val] = temp;
        }    
    }        
    public static void main(String[] args)
    {
       String[] fruits = {"papaya","lime","mango","orange","apple"};
       sortFruits(fruits);
       for(String val : fruits)
       {
         System.out.print(val+" ");
       }    
       System.out.println();
    }        
}
