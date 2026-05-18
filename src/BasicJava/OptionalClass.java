package BasicJava;

import java.util.Optional;

public class OptionalClass {

    static String getName(){
        return "Vedant";
    }
    public static void main(String[] args) {
        // Instead of writing this
        String name = getName();
        if (name != null) {
            System.out.println(name);
        }

        // we can use
        Optional<String> op = Optional.ofNullable(getName());
        op.ifPresent(System.out::println);

    }
}
