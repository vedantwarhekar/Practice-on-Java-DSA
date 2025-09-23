package Recurssion;

// write a java program to print fabonacci seriese upto given number
class PWQ3
{
    static int fabonacci(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return fabonacci(n-1)+fabonacci(n-2);
    }
    public static void main(String[] args)
    {
          for(int i=0;i<=10;i++)
          {
            System.out.println(fabonacci(i));
          }
    }
}