package Lambda;

import java.util.function.BiConsumer;

@FunctionalInterface
interface Mallo{
    void sayHello();
}

@FunctionalInterface
interface Calculatorkk{
    int calculate(int a, int b);
}

public class Practice {
    public static void main(String[] args) {
        BiConsumer<String,String> concanitate = (String str , String ttr) ->{
            System.out.println(str+ttr);
        };
         concanitate.accept("swami","samartha");
         Calculatorkk cal = (int a, int b)->{
             return  a + b;
         };
         System.out.println(cal.calculate(10, 12));
         Mallo hell = ()-> System.out.println("Hello vedant, you are to much good");
         hell.sayHello();
    }
}
