package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] Array1 = { 3, 2, 11, 4, 6, 7 };
		int[] Array2 = { 1, 2, 8, 4, 9, 7 };
		
		List<Integer> input1 = new ArrayList<Integer>();
		List<Integer> input2 = new ArrayList<Integer>();
		
		//adding Array1 to input1 and Array2 to input2
		
		for (Integer output1 : Array1) {
			
			input1.add(output1);
			
		}
		for (Integer outut2 : Array2) {
			input2.add(outut2);
			
		}
		//iterating each array value between Input1 and Input2 to find the intersection and printing
		
		for (int i = 0; i < input1.size(); i++) {
			for (int j = 0; j < input2.size(); j++) {
				if(input1.get(i)==input2.get(j)) {
					
					System.out.println(input1.get(i));
}}}}}
