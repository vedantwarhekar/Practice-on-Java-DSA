/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class RoughWork
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int[] arr = new int[n1];
       for(int i=0;i<arr.length;i++)
       {
          arr[i] = sc.nextInt();
       }     
       System.out.println("///////////////////////////");
       int n2 = sc.nextInt();
       int[] arr2 = new int[n2];
       for(int i=0;i<arr2.length;i++)
       {
          arr2[i] = sc.nextInt();
       }     
       
//       
       int[] diff = new int[n2];
       int c =0;
        
       int i = arr.length-1;
       int j = arr2.length-1;
       int k = diff.length-1;
       
       while(k >= 0)
       {
         int d =0;
         int arr1v = i>=0 ? arr[i] : 0 ;
         if(arr[j]+c >= arr1v)
         {
           d = arr2[j]+c - arr1v;
           c =0;
         }
         else
         {
            d = arr2[j]+c+10-arr1v;
            c=-1;
         }
         
         diff[k] = d;
         
         i--;
         j--;
         k--;
       }
       
      int idx =0;
           while(idx < diff.length){
               if(diff[idx] ==0)
               {
                  idx++;
               }else
               {
                  break;
               }
           } 
            ////////////
            while(idx < diff.length)
            {
               System.out.println(diff[idx]);
               idx++;
            }    
    }     
}
