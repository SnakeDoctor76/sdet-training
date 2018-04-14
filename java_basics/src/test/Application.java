package test;

import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		
		HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43);
		
		for(Integer value: values) {
			System.out.println(value);
		}

	}

}
