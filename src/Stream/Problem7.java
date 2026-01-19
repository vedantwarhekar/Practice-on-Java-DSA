package Stream;

import java.util.List;

// Filter a list based on multiple conditions
class ProductT {
    String name;
    String category;
    double price;
    boolean available;

    ProductT(String name, String category, double price, boolean available) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    String getCategory() { return category; }
    double getPrice() { return price; }
    boolean isAvailable() { return available; }

    @Override
    public String toString() {
        return "ProductT{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}

public class Problem7 {
    public static void main(String[] args) {
        List<ProductT> products = List.of(
                new ProductT("Laptop", "Electronics", 60000, true),
                new ProductT("Mobile", "Electronics", 30000, false),
                new ProductT("Shirt", "Clothing", 1500, true),
                new ProductT("Jeans", "Clothing", 2500, true),
                new ProductT("Book", "Education", 500, true)
        );

        List<ProductT> result = products.stream()
                .filter( product -> product.getCategory()
                        .equals("Electronics") && product.getPrice() > 40000 &&
                        product.isAvailable()
                ).toList();

        List<ProductT> result2 = products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .filter(product -> product.getPrice() > 40000)
                .filter(product -> product.isAvailable()).toList();

        // You can see both work in similar way
        System.out.println(result.equals(result2));

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i).toString());
        }
        System.out.println();
    }
}
