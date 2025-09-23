/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;
import java.util.Scanner;
/**
 * Q Rotate a given number
 * @author Administrator
 */
public class Q7
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       
       int temp =n;
       int nod =0;
       while(temp!=0)
       {
          temp = temp/10;
          nod++;
       }  
       //hANDALING SPECIAL CASES
       // if value is more than number
       k = k % nod ;
       // if value is negative number
       if(k< 0){
            k =k+nod;
       }       
       int div = 1;
       int mult = 1;
       for(int i=1;i<=nod;i++)
       {
          if(i<=k){
              div = div*10;
          }else{
              mult = mult * 10;
          }    
       }
       int q = n/div;
       int r = n %div;
       
       int rotet = r * mult+ q;
       System.out.println(rotet);
    }
}
