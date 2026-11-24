package DesignPattern.IteratorDp;


public class Main {
    public static void main(String[] args) {

        StudentCollection collection = new StudentList();

        StudentIterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}