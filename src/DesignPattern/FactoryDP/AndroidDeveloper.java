package DesignPattern.FactoryDP;


// In this the classes are tightly coupled because we are directly implementing
public class AndroidDeveloper implements Employee{
    @Override
    public int salary(){
        return 800000;
    }
}
