package DesignPattern.singletonDP;

//Edger Way of creating object
public class Example2 {

    private static Example2 exp2 = new Example2();

    public static Example2 getEdgerWayOfSp(){
        return exp2;
    }
}
