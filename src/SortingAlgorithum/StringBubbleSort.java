// bubble sort for string

import java.util.Scanner;
class StringBubbleSort
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Entre the length of array");
         String[] arr = new String[sc.nextInt()];

         for(int i=0;i<arr.length;i++)
         {
            System.out.print("Entre the value of array for "+ i + " :- ");
            arr[i] = sc.next();
         }
         
         for(int i=0;i<arr.length;i++)
         {
             boolean flag = true;
             for(int j=0;j<arr.length-1-i;j++)
             {
                // return o if equal
                // return 1 if grater
                // return -1 if smaller
                if(arr[j].compareTo(arr[j+1])>0)
                {
                  String temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  flag = false; 
                }
                if(flag == true)
                {
                   break;
                }
             }
    
         } 
        for(int i=0;i<arr.length;i++)
         {
            System.out.print(arr[i]+" ");
         }         

    }
 
}