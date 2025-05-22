package Java8;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // Create a List of Strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the List
        System.out.println("Fruits: " + fruits);

        // Access an element by index
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        // Iterate over the List
        System.out.println("Iterating over the List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}