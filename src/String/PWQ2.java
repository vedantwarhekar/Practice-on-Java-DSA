/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *  given a string the task is to toggle all character of the string
 *  i.e to convert upper case to lower case and vise versa;
 * @author Administrator
 */
public class PWQ2
{
    public static void main(String[] args)
    {
       String str = "PhySiCS";
 //you can directly convert the string into StringBuilder than u can solve it like PWQ3
 //    StringBuilder str1 = new StringBuilder(str);
       System.out.print(str + "-> ");
       for(int i =0;i<str.length();i++)
       {
          boolean flag = true; //consider as uppercase
          char ch = str.charAt(i);
          if(ch==' ') continue;
          int ascii = (int)ch;
          if(ascii>=97) flag = false;
          if(flag == true)
          {
            ascii+=32;
            char dh = (char)ascii;
            str = str.substring(0,i)+ dh +str.substring(i+1);
          }  
          else
          {
            ascii -= 32;
            char dh = (char)ascii;
            str = str.substring(0,i)+dh+str.substring(i+1);
          }    
       }
       System.out.print(str);
       System.out.println();
    }        
}
