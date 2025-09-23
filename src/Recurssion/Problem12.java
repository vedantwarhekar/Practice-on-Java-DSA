/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q remove all duplicate charachter  from the string
 * @author Administrator
 */
public class Problem12 
{
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str,int idx,String new_string)
    {  
       if(idx==str.length())
       {
          System.out.println(new_string);
          return;
       }
       char currentchar = str.charAt(idx);
       if(map[currentchar-'a']==true)
       {
          removeDuplicates(str,idx+1,new_string);
       }else{
          new_string += currentchar;
          map[currentchar -'a'] = true;
          removeDuplicates(str,idx+1,new_string);
       }    
    } 
    public static void main(String[] args)
    {
       String str="aabbccdefgg";
       String new_string ="";
       removeDuplicates(str,0,new_string);
    }        
}
