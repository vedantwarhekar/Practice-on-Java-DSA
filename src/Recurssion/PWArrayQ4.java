/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

import java.util.ArrayList;

/**
 * Q1 find wheather the x exist in the array or not
 * Q2 print all indexes of that existing element
 * Q3 return the array list which contain all the indexes which has target element x
 * @author c068
 */
public class PWArrayQ4
{
    // Q1
    static boolean findArray(int[] arr,int idx,int x)
    {
      if(idx == arr.length)
      {
         System.out.println("Element not found");
         return false;
      }
      if(arr[idx]==x)return true;
      return findArray(arr,idx+1,x);
    }
    // Q2
    static void findArray2(int[] arr,int idx,int x)
    {
       if(idx == arr.length)
       {
         return;
       }
       if(arr[idx] == x)
       {
         System.out.println(idx);
       }
       findArray2(arr,idx+1,x);
    }
    // Q3 
    static ArrayList<Integer> findElement3(int[] arr,int idx,int x)
    {
       if(idx == arr.length)
       {
         return new ArrayList<Integer>();
       } 
       ArrayList<Integer> ans = new ArrayList<>();
       if(arr[idx] == x)
       {
         ans.add(idx);
       }
       ArrayList<Integer> smallans = findElement3(arr,idx+1,x);
       ans.addAll(smallans);
       return ans;
    }        
    public static void main(String[] args)
    {
        int[] arr = {55,78,96,55,58};
        ArrayList<Integer> ans = findElement3(arr,0,55);
        for(int i: ans)
        {
         System.out.print(i+" ");
        }
        System.out.println();
    }        
}
