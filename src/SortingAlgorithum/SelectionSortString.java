import java.util.Scanner;

class SelectionSortString
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
 
       String[] arr = new String[5];

       for(int i=0;i<arr.length;i++)
       {
        arr[i] = sc.nextLine();  
       }
       String temp = "";
       for(int i=0;i<arr.length;i++)
       {
         int min = i;
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[j].compareTo(arr[min]) < 0)
             {
                   min =j;
             }
         }
         temp = arr[i];
         arr[i] = arr[min];
         arr[min] = temp; 
       }
       for(int i=0;i<arr.length;i++)
       {
            System.out.println(arr[i]);
       }
   }

}