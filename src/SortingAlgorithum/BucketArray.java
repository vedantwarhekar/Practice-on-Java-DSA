/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author c068
 */
public class BucketArray
{
   static void BucketSort(float[] arr)
   {
       int n = arr.length;
       //Buckets
       ArrayList<Float>[] buckets = new ArrayList[n];
       // create empty buckets 
       for(int i=0;i<n;i++)
       {
         buckets[i] = new ArrayList<Float>();
       }
       //add element into our buckets
       for(int i=0;i<arr.length;i++)
       {
          int bucketIndex = (int)arr[i]*10;
          buckets[bucketIndex].add(arr[i]);
       }  
       // sort each bucket indivisualy
       for(int i=0;i<buckets.length;i++)
       {
         Collections.sort(buckets[i]);
       }    
       //merged all buckets to get final Sorted array
       int index = 0;
       for(int i=0;i<buckets.length;i++)
       {
         ArrayList<Float> currBucket = buckets[i];
         for(int j=0;j < currBucket.size();j++)
         {
            arr[index++] = currBucket.get(j);
         }    
       }    
   }        
   public static void main(String[] args)
   {
     float[] arr = {0.45f,0.75f,0.35f,0.25f};
     BucketSort(arr);
     for(float i:arr)
     {
       System.out.print(i+" ");
     }    
      System.out.println();
   }        
}
