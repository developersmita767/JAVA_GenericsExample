package Generics;


import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcard {
	 // Generic method to add elements to a list
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i); // Autoboxing converts int to Integer
        }
    }
	public static void main(String[] args) {
		 // Create lists of different types
        List<Integer> intList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        // Add elements to each list using the addNumbers method
        addNumbers(intList);
        addNumbers(numberList);
        addNumbers(objectList);

        // Print the contents of each list
        System.out.println("Integer List: " + intList);
        System.out.println("Number List: " + numberList);
        System.out.println("Object List: " + objectList);

	}

}