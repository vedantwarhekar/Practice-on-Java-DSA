/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class ArtificialArrayList
{
  static class Arraylist
  {
     int[] arr = new int[2];
     int idx = 0;
     int size = 0;
     void add(int ele)
     {
        if(size == arr.length)
        {
           int[] bin = Arrays.copyOf(arr,arr.length*2);
           arr = bin;
        }    
        arr[idx] = ele;
        idx++;
        size++;
     }        
    void set(int idx,int value)
    {
      arr[idx] = value;
    }  
    int get(int idx)
    {
      return arr[idx];
    } 
    void remove(int idx)
    {
     if(idx < 0 || idx > arr.length)
     {
         System.out.println("Array Index out of Bound");
     }
     else
     {
        for(int i = idx;i<arr.length-1;i++)
        {
          arr[i] = arr[i+1];
        }    
     }
     arr = Arrays.copyOf(arr,arr.length-1);
     size--;
    }        
  } 
  public static void main(String[] args)
  {
     Arraylist arr = new Arraylist();
     arr.add(5);
     arr.add(10);
     System.out.println(arr.size);
     arr.add(15);
     arr.add(25);
     System.out.println(arr.size);
     
     arr.set(3,20);
     System.out.println("===========");
     for(int i=0;i<arr.size;i++)
     {
        System.out.print(arr.get(i)+" ");
     }    
     System.out.println("===========");
     arr.remove(0);
     for(int i=0;i<arr.size;i++)
     {
        System.out.print(arr.get(i)+" ");
     } 
     System.out.println("===========");
  }        
}
