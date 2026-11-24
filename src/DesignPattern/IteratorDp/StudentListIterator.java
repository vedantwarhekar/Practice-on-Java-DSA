package DesignPattern.IteratorDp;

import java.util.NoSuchElementException;

public class StudentListIterator implements StudentIterator{

    private final String[] students;

    private int position = 0;

    public StudentListIterator(String[] students){
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position < students.length;
    }

    @Override
    public String next() {
        if(!hasNext()){
            throw new NoSuchElementException("No more students!");
        }
        return students[position++];
    }
}
