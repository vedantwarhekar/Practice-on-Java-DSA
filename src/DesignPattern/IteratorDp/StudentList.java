package DesignPattern.IteratorDp;

public class StudentList implements StudentCollection{
    private final String[] students = {
            "Aarav", "Priya", "Rahul", "Sneha"
    };

    @Override
    public StudentIterator createIterator(){
        return new StudentListIterator(students);
    }
}
