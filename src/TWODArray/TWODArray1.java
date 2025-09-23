package TWODArray;
import java.util.Scanner;

public class TWODArray1
{
   static void inputArrayValue(int[][] arr)
   {
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               arr[i][j] = sc.nextInt();
           }
       }
   }
    static void printArray(int[][] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
               System.out.print( arr[i][j]);
            }
            System.out.println();
        }
    }

}
