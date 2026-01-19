/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */

class User{
    private String name;
    void setName(String name){
        this.name = name;
    }
}
public class Test1 
{   
    public static void main(String[] args)
    {
       User u1 = new User();
       u1.setName("java");

       User u2 = new User();
       u2.setName("java");

        HashSet<User> set = new HashSet<>();
        set.add(u1);
        set.add(u2);
        System.out.println(set.size());
    }   
}
