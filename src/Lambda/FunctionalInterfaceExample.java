package Lambda;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface Calculator{
  int calculate(int a, int b);
}

@FunctionalInterface
interface FunctionalExmple
{
    // only one abstract method is allowed
    public void sayHello();

    // you can create any number of default and static method in functional interface
    default void sayBy(){

    }

    public static void sayOk(){

    }
}
public class FunctionalInterfaceExample {

    Calculator add = (a,b) -> {
        return a + b;
    };

    // we can remove the {} brackets as well if there is only one command and return statement
    Calculator multiply = (a,b) -> a * b;

   // and if there is only one parameter that we can remove () this as well
    // Print pl = str -> System.out.println(str);
}
