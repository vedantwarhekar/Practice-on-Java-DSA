/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * find the first and last occurance of an element or chrachter in a given string
 * @author Administrator
 */
public class Problem8
{      
       public static int first = -1;
       public static int last = -1;
       public static void countOccurance(String str , int idx , char element)
       {
           if(idx == str.length())
              {
                  System.out.println(first);
                  System.out.println(last);
                  return;
               }    
          if(str.charAt(idx) == element)
          {
             
              if(first == -1)
               {
                   first= idx;
               }else{
                  last = idx;
               }
               
          }
          countOccurance(str,idx+1,element);
       }        
       public static void main(String[] args)
       {
          String str="vedantvarhekar";
          countOccurance(str,0,'v');
       }        
}
