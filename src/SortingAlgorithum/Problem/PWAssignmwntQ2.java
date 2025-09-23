/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;

/**
 * given a string s ,return the string which contain all charachter in lexographical
 * order
 * @author c068
 */
public class PWAssignmwntQ2 {
    static StringBuilder arranger(String str)
    {
      StringBuilder str1 = new StringBuilder(str);
      int n = str1.length();
      for(int i=0;i<n-1;i++)
      {
        int min_val = i;
        for(int j=i+1;j<n;j++)
        {
           if(str1.charAt(min_val) > str1.charAt(j))
           {
             min_val = j;
           }    
        }
        char temp = str.charAt(i);
        str1.setCharAt(i,str1.charAt(min_val));
        str1.setCharAt(min_val, temp);
      }
      return str1;
    }        
    public static void main(String[] args)
    {
       String str = "coding";
       
       System.out.println(arranger(str));
    }        
}
