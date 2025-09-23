/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoderByte;

/**
 *
 * @author c068
 */
public class count {
    public static void main(String[] args)
    {
       String str = "ved25gg";
       String []str1 = str.split("[^a-z^A-z]");
       int count =0;
       for(int i=0;i<str1.length;i++)
       {
         if(str1[i] != "")
         {
            count+=str1[i].length();
         }    
       } 
       System.out.println(count);
    }        
}
