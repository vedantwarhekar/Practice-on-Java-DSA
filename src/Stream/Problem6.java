package Stream;

// Count elements by category using groupingBy()

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    String getCategory() {
        return category;
    }
}
public class Problem6 {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Laptop", "Electronics"),
                new Product("Mobile", "Electronics"),
                new Product("TV", "Electronics"),
                new Product("Shirt", "Clothing"),
                new Product("Jeans", "Clothing"),
                new Product("Book", "Education")
        );

        Map<String,Long> countByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.counting()
                ));

        System.out.println(countByCategory);
    }
}
