/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.HashMap;

/**
 *  find the total number of pairs in arrays who's sum is equal to the give value 7
 * @author Administrator
 */
public class PWProblem 
{
    public static void main(String[] args)
    {  
       int[] arr = {4,6,3,5,8,2};
       int num = 7;
       int answer =0;
       
//       for(int i=0;i<arr.length;i++)
//       {
//          for(int j=i+1;j<=arr.length-1;j++)
//          {
//             if(arr[i]+arr[j]== num)
//             {
//                answer++;
//             }
//          }
//       }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int needed = num - arr[i];
            if(map.containsKey(needed)){
                System.out.println(map.get(needed)+" "+ i);
                break;
            }
            map.put(arr[i],i);
        }
    }        
}
