package BasicJava;


import java.util.*;

// ===========================
// 1️⃣ Generic Class
// ===========================
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

// ===========================
// 2️⃣ Generic Method
// ===========================
class Util {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// ===========================
// 3️⃣ Bounded Type Parameter
// ===========================
class Calculator<T extends Number> {
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}

// ===========================
// 4️⃣ Generic Interface
// ===========================
interface Container<T> {
    void add(T item);
    T get();
}

class StringContainer implements Container<String> {
    private String value;

    public void add(String item) {
        this.value = item;
    }

    public String get() {
        return value;
    }
}

// ===========================
// 5️⃣ Wildcards Example
// ===========================
class WildcardExample {
    // Unbounded wildcard
    public void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    // Upper bounded wildcard
    public void printNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        System.out.println("Sum of numbers = " + sum);
    }

    // Lower bounded wildcard
    public void addIntegers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) list.add(i);
        System.out.println("After adding integers: " + list);
    }
}

// ===========================
// 6️⃣ Main Class to Run All
// ===========================
public class GenericsDemo {
    public static void main(String[] args) {

        System.out.println("==== 1. Generic Class ====");
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics!");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println(intBox.get());

        System.out.println("\n==== 2. Generic Method ====");
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};
        Util.printArray(intArray);
        Util.printArray(strArray);

        System.out.println("\n==== 3. Bounded Type ====");
        Calculator<Integer> calc = new Calculator<>();
        System.out.println("Sum: " + calc.add(10, 20));

        System.out.println("\n==== 4. Generic Interface ====");
        StringContainer sc = new StringContainer();
        sc.add("Generic Interface Example");
        System.out.println(sc.get());

        System.out.println("\n==== 5. Wildcards ====");
        WildcardExample wc = new WildcardExample();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        wc.printList(names);

        List<Integer> numbers = Arrays.asList(10, 20, 30);
        wc.printNumbers(numbers);

        List<Number> numList = new ArrayList<>();
        wc.addIntegers(numList);
    }
}
