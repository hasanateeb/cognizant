package week1.EcommerceSearch;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Shoes", "Footwear"),
            new Product(2, "Watch", "Accessories")
        };

        // Linear Search Test
        Product result1 = LinearSearch.search(products, 2);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

        // Binary Search Test
        Product result2 = BinarySearch.search(products, 2);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));
    }
}
