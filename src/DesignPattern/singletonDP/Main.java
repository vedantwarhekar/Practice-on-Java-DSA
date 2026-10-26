package DesignPattern.singletonDP;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

// This is a Lazy way of creating the bean
public class Main {
    public static void main(String[] args) throws
            NoSuchMethodException, InvocationTargetException, InstantiationException,
            IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

        // Object check for lazy loading
        Example1 exp1 = Example1.getExample1();
        System.out.println("First Object of Example1:- "+exp1.hashCode());
        Example1 exp2 = Example1.getExample1();
        System.out.println("Second Object of Example1:- "+ exp2.hashCode());

        // object check for edger loading
        Example2 exp2One = Example2.getEdgerWayOfSp();
        System.out.println("First Object of  Example2:- "+exp2One.hashCode());
        Example2 exp2Two = Example2.getEdgerWayOfSp();
        System.out.println("Second Object of Example2:- "+ exp2Two.hashCode());

        // Object to check Reflection Api To break Singleton pattern
        // Solution First Check
//        Constructor<Example1> constructor = Example1.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Example1 exp3 = constructor.newInstance();
//        System.out.println("Third Object Example1:- "+exp3.hashCode());

        // Object to check Reflection Api To break Singleton pattern
        // Solution Second Check
        Example3 exp3One= Example3.INSTANCE;
        System.out.println("First Object of Example3:- "+exp3One.hashCode());
        // for enum you cannot  Example3.class.getDeclaredConstructor();

        Example1 exp3 = Example1.getExample1();
        System.out.println(exp3.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(exp3);

        System.out.println("serialization done...");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Example1 exp4 = (Example1) ois.readObject();
        System.out.println(exp4.hashCode());
    }
}
