package Array;

/**
 * find the duplicates in the array and replace them with -1
 * @author Administrator
 */
public class PWProblem3 
{
    public static void main(String[] args)
    {
       int[] arr = {1,2,3,4,2,1,3};
       for(int i=1;i<arr.length-1;i++)
       {
        if(arr[i] > arr[i+1] && arr[i] > arr[i-1])
        {
            System.out.println(arr[i]);
        }    
       }    
    }        
}
