package Generics;


import java.util.Arrays;
import java.util.List;

public class UnboundedWildcardExample {
	// Generic method to print elements of a list using an unbounded wildcard
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
        // Create lists of different types
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<String> stringList = Arrays.asList("Hello", "World", "Generics", "In", "Java");
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);

        // Print each list using the printList method
        System.out.println("Integer List:");
        printList(intList);

       /* System.out.println("\nString List:");
        printList(stringList);

        System.out.println("\nDouble List:");
        printList(doubleList);*/
    }

    
}
