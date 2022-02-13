package week1;

import java.util.*;

public class Mod3week1hw2 {
	//Write a Java program to copy one array list into another
	static ArrayList<String> copyList(ArrayList<String> origin){
		ArrayList<String> copy = new ArrayList<String>();
		copy = (ArrayList<String>)origin.clone();
		return copy;
	}
	
	//Write a Java program to extract a portion of an array list
	static ArrayList<String> extractList(ArrayList<String> origin){	
		ArrayList<String> sub_list = new ArrayList<String> (origin.subList(0, 2));
		return sub_list;
	}
	
	//Write a Java program of swap two elements in an array list
	static void swapList(ArrayList<String> origin, int first, int last) {
		Collections.swap(origin, first, last);
	}
	
	//Write a Java program to test an array list is empty or not
	static String isEmptyList(ArrayList<String> origin) {
		//Cannot use length with ArrayList
		if(origin.isEmpty()) {
			
			return " is empty.";
		} else {
			return " is full.";
		}
		//(lista.isEmpty()) ? System.out.println("OK") : System.out.println("NO"); Wouldn't work. In java ternary needs to be assigned and to return a value.
	}
	
	//Write a Java program to replace the second element of an ArrayList with the specified element.
	static void replaceElList(ArrayList<String> list, int ElIndex, String replacement) {
		list.set(ElIndex, replacement);
	}
	
	//Write a Java program to trim the capacity of an array list the current list size.
	static void trimCapToSize(ArrayList<String> list) {
		list.trimToSize();
	}

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		// Add items
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Ford");
		cars.add("Nissan");
		
		//Testing copyList()
		ArrayList<String> carsCopy = copyList(cars);
		System.out.println("cars: " + cars);
		System.out.println("carsCopy: " + carsCopy);
		System.out.println();
		
		//Testing extractList()
		ArrayList<String> carsSub = extractList(cars);
		System.out.println("extracted list: " + carsSub);
		System.out.println();
		
		//Testing swapList()
		System.out.println("cars before swap: " + cars);
		swapList(cars, 0, 1);
		System.out.println("cars after swap 0 and 1: " + cars);
		System.out.println();
		
		//Testing isEmptyList()
		ArrayList<String> basket = new ArrayList<String>();
		System.out.println("cars "+ isEmptyList(cars));
		System.out.println("basket "+ isEmptyList(basket));
		System.out.println();
		
		//Testing replaceElList()
		replaceElList(cars, 1, "Orange");
		System.out.println("cars after replacing 2nd El" + cars);
		System.out.println();
		
		//Testing trimCapToSize();
		trimCapToSize(cars);

	}

}
