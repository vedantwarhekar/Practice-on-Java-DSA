package Stack;

class Stack{
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top=-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize-1;
    }

    public void push(int element){
        if(isFull())
        {
            System.out.println("Stack Overflow!");
            return;
        }
        top++;
        stackArray[top] =element;
        System.out.println("Element inserted");
    }

    public int pop(){
        if(isEmpty())
        {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek(){
        if(isEmpty())
        {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stackArray[top];
    }
}

public class StackUsingArray {
    public static void main(String[] args)
    {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        for(int i = 0; i < 5; i++)
        {
            System.out.println(stack.pop());
        }
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
