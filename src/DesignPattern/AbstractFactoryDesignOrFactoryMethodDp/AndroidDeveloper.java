package DesignPattern.AbstractFactoryDesignOrFactoryMethodDp;


// In this the classes are tightly coupled because we are directly implementing
public class AndroidDeveloper implements Employee {

    @Override
    public int salary(){
        return 800000;
    }

    @Override
    public String name(){
        System.out.println("I am android developer");
        return "ANDROID DEVELOPER";
    }

}
