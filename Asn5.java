import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // Create the ArrayLists
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();

        // Add 4 items to each ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);

        // Display the contents of each ArrayList using different methods
        System.out.println("Contents of stringList:");
        // Basic for loop
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("\nContents of intList:");
        // Enhanced for loop (for-each loop)
        for (Integer num : intList) {
            System.out.println(num);
        }

        // Perform 2 more operations on each ArrayList
        // Example operations: remove an item and check if an item exists
        stringList.remove("Banana");
        boolean containsCherry = stringList.contains("Cherry");

        intList.remove(Integer.valueOf(20));
        boolean contains50 = intList.contains(50);

        // Display the ArrayLists again after operations
        System.out.println("\nContents of stringList after operations:");
        stringList.forEach(item -> System.out.println(item));

        System.out.println("\nContents of intList after operations:");
        intList.forEach(num -> System.out.println(num));

        // Display results of the operations
        System.out.println("\nDoes stringList contain 'Cherry'? " + containsCherry);
        System.out.println("Does intList contain 50? " + contains50);
    }
}