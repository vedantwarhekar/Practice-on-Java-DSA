package BasicJava;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class StreamFunctionalDemo {

    public static void main(String[] args) {

        // ======================================
        // 1️⃣ Basic Stream Operations
        // ======================================
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Original List: " + numbers);

        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even Numbers: " + evenNumbers);

        // Map - Square each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("Squares: " + squares);

        // Sorted
        List<Integer> sortedDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sorted Desc: " + sortedDesc);

        // Distinct + Limit + Skip
        List<Integer> distinctLimited = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6)
                .stream()
                .distinct()
                .skip(1)
                .limit(3)
                .toList();
        System.out.println("Distinct + Skip + Limit: " + distinctLimited);

        // ======================================
        // 2️⃣ Terminal Operations
        // ======================================

        // forEach
        System.out.print("forEach Print: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // reduce - sum
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum using reduce: " + sum);

        // count, min, max
        System.out.println("Count: " + numbers.stream().count());
        System.out.println("Min: " + numbers.stream().min(Integer::compare).get());
        System.out.println("Max: " + numbers.stream().max(Integer::compare).get());

        // collect and joining
        String joined = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Joined String: " + joined);

        // ======================================
        // 3️⃣ flatMap Example
        // ======================================
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E", "F")
        );

        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flat List: " + flatList);

        // ======================================
        // 4️⃣ Collectors: groupingBy & partitioningBy
        // ======================================
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Daniel");

        // Group names by length
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped By Length: " + groupedByLength);

        // Partition names - longer than 4
        Map<Boolean, List<String>> partitioned = names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println("Partitioned (>4): " + partitioned);

        // ======================================
        // 5️⃣ Functional Interfaces Examples
        // ======================================

        // Predicate - test condition
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Predicate isEven(6): " + isEven.test(6));

        // Function - map input to output
        Function<String, Integer> lengthFunc = String::length;
        System.out.println("Function length of 'Hello': " + lengthFunc.apply("Hello"));

        // Consumer - perform an action
        Consumer<String> printer = msg -> System.out.println("Consumer prints: " + msg);
        printer.accept("Hello Functional World!");

        // Supplier - provide a value
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Supplier random: " + randomSupplier.get());

        // BiFunction - combine two values
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("BiFunction add(10, 20): " + add.apply(10, 20));

        // ======================================
        // 6️⃣ Parallel Stream Example
        // ======================================
        int parallelSum = numbers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Parallel Stream Sum: " + parallelSum);

        System.out.println("\n✅ Stream & Functional API Demo Completed!");
    }
}

