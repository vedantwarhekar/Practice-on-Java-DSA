package TWODArray;

import java.util.Scanner;

import static TWODArray.TWODArray1.printArray;
import static  TWODArray.TWODArray1.inputArrayValue;
public class TWODArrayP1
{
     static void spiralOrderMatrix(int[][] arr,int r,int c)
     {
         int tr = 0,rc = c-1,br = r-1,lc = 0;
         int totalElement = 0;
         while(totalElement < r*c)
         {
             for(int i=tr;i<=rc && totalElement < r*c;i++)
             {
                 System.out.print(arr[tr][i]+" ");
                 totalElement++;
             }
             tr++;
             for(int i=tr;i<=br && totalElement < r*c;i++)
             {
                 System.out.print(arr[i][rc]+" ");
                 totalElement++;
             }
             rc--;
             for(int j=rc;j>=lc && totalElement < r*c;j--)
             {
                 System.out.print(arr[br][j]+" ");
                 totalElement++;
             }
             br--;
             for(int j=br;j>=tr && totalElement <r*c;j--)
             {
                 System.out.print(arr[j][lc]+" ");
                 totalElement++;
             }
             lc++;
         }
     }
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Entre the row of matrix :- ");
         int r = sc.nextInt();
         System.out.print("Entre the columns of matrix :- ");
         int c = sc.nextInt();

         int[][] arr = new int[r][c];
         inputArrayValue(arr);
         
         spiralOrderMatrix(arr,r,c);
     }
}
