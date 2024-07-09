package Generics;


import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcard {
	  // Generic method to calculate the sum of a list of numbers
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
	public static void main(String[] args) {
		// Create lists of different types of numbers
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        List<Float> floatList = Arrays.asList(1.1f, 2.2f, 3.3f, 4.4f, 5.5f);
        List<Number> numList = Arrays.asList(5, 6, 3, 4, 5);
        List<Object> objList = Arrays.asList(5, 6, 3, 4, 5);
        // Calculate and print the sum of each list
        System.out.println("Sum of integer list: " + sumOfList(intList));
        System.out.println("Sum of double list: " + sumOfList(doubleList));
        System.out.println("Sum of float list: " + sumOfList(floatList));
        System.out.println("Sum of Numbers list: " +sumOfList(numList));
       // System.out.println("Sum of Obj list: " +sumOfList(objList));
    	
	}

}
