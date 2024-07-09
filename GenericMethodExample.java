package Generics;


public class GenericMethodExample {
	// Generic method to print array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		 // Create arrays of different types
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "Generics", "In", "Java"};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        // Print arrays using the generic method
        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("\nString Array:");
        printArray(stringArray);

        System.out.println("\nDouble Array:");
        printArray(doubleArray);

	}

}
