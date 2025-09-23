/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Arrays;
/**
 *
 * @author User
 */
public class RemoveDuplicate {
    
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,3,2,1,2,5,6,7,3,5,6,8,4,2,3,6};
        
        int ans1[] = new int[arr.length];
        int uniqueCOunt = 0;
        
        for(int i = 0; i < arr.length;i++)
        {
            boolean isDuplicate = false;
            
            for(int j = 0 ; j < uniqueCOunt;j++)
            {
                if(arr[i] == ans1[j])
                {
                    isDuplicate = true;
                    break;
                }    
            }    
            if(!isDuplicate)
                {
                    ans1[uniqueCOunt] = arr[i];
                    uniqueCOunt++;
                } 
        }  
        
        int result[] = Arrays.copyOf(ans1, uniqueCOunt);
            
         System.out.print(Arrays.toString(result) + " ");
    }        
}
