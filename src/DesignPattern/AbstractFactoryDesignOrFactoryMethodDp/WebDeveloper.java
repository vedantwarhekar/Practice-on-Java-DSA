package DesignPattern.AbstractFactoryDesignOrFactoryMethodDp;

public class WebDeveloper implements Employee{
    @Override
    public int salary(){

        return 500000;
    }

    @Override
    public String name(){
        System.out.println("I am web developer");
        return "WEB DEVELOPER";
    }
}
