/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoderByte;
import java.util.*;
import java.io.*;
/**
 * Powers of Two
    Have the function Power of Two (num) take the num parameter
    being passed which will be an integer and return the string true
    If it's a power of two. If it's not return the string false. For
    example if the input is 16 then your program should return the
    string true but if the input is 22 then the output should be the
    string false.
    Examples
    Input: 4
    Output: true
    2
 * @author Administrator
 */
public class PowerOf2 {
    public static boolean PowerOfTwo(int num)
    {
       double number = (double)num;
       if(number%2 ==0)
       {
         while(number >=2.0)
         {
           number/=2.0;
         }  
       }else
         {
             return false;        
         } 
       return number == 1.0 ?true:false;
    }        
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println(PowerOfTwo(4));
         System.out.println(PowerOfTwo(124));
    }        
}
//public class Solution {
//    public static boolean isPowerOfTwo(int n) {
//        if (n == 0) {
//            return false;
//        }
//
//        while (n % 2 == 0) {
//            n /= 2;
//        }
//
//        return n == 1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPowerOfTwo(16)); // true
//        System.out.println(isPowerOfTwo(3)); // false
//        System.out.println(isPowerOfTwo(0)); // false
//        System.out.println(isPowerOfTwo(-1)); // false
//    }
//}