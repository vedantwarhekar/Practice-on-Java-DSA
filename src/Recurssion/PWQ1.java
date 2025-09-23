package Recurssion;

// program for print n natural numbre from n to 1 and from 1 to n
import java.util.Scanner;

class PWQ1
{
    static void increasint(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        increasint(n-1);
        System.out.println(n);
    } 
    static void decreaseint(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        decreaseint(n-1);
        
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        increasint(n);
        decreaseint(n);
    }
}