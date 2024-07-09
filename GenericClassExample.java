package Generics;


import java.util.ArrayList;
import java.util.function.BiFunction;

class Square<T> {
    private T length;

    public void setLength(T length) {
        this.length = length;
    }

    public T getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Square{" + "length=" + length + '}';
    }
}
public class GenericClassExample {
	
	public static void main(String[] args) {
		
		 // Create a Square  an Integer
        Square<Integer> integerSquare = new Square<>();
        integerSquare.setLength(123);
        System.out.println("Integer Box: " + integerSquare);

        // Create a Square Long
        Square<Long> longsquare = new Square<>();
        longsquare.setLength(123L);
        System.out.println("Long square: " + longsquare);


        // Create a Square Double
        Square<Double> doubleSquare = new Square<>();
        doubleSquare.setLength(45.67);
        System.out.println("Double Square: " + doubleSquare);

	}

}
