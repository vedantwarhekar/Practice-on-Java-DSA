package Lambda;

import java.util.function.BiConsumer;

public class LambdaPractice1 {

   public static void main(String[] args)
   {
       // BiConsumer is the default functional interface
       BiConsumer<Integer,Integer> addTwoInt = (a,b) ->{
           System.out.println(a + b);
       };

       addTwoInt.accept(2,2);
   }
}
