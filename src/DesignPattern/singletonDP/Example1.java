package DesignPattern.singletonDP;

import java.io.Serializable;

public class Example1 implements Serializable, Cloneable {
    // A Variable t store the object
     private static Example1 exp;
    //for SP:- constructor should be private
    private Example1(){
        //solution for Reflection Api To break Singleton pattern
        if(exp != null){
            throw new RuntimeException("You are tring to break single ton pattern.");
        }
    }

    public static Example1 getExample1(){
        // Object of this class
        if(exp == null){
            synchronized (Example1.class){
                if(exp == null) {
                    exp = new Example1();
                }
            }
        }
        return exp;
    }

    // For Resolution of Deserialization way of breaking SP
    public Object readResolve(){
        return exp;
    }

    // For Resolution of Cloning way of breaking SP
    @Override
    public Object clone() throws CloneNotSupportedException{
        // return super.clone();
        return exp;
    }
}
