/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q move all 'x' to the end of the given string
 *   axbcxxd
 * @author Administrator
 */
public class Problem11 
{
    public static void shiftChar(String str,int idx,int count,String new_string)
    {
      if(idx == str.length())
      {
        for(int i=0;i<count;i++)
        {
           new_string += 'x';
        }  
        System.out.println(new_string);
        return;
      }    
      char currentchar = str.charAt(idx);
      if(currentchar == 'x')
      {
         count++;
         shiftChar(str,idx+1,count,new_string);
      }else{
          new_string += currentchar;
          shiftChar(str,idx+1,count,new_string);
      }    
    }        
    public static void main(String[] args)
    {
      String str= "axbcxxd";
      String new_string ="";
      shiftChar(str,0,0,new_string);
    }        
}
