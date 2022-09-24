package week3.day2.assignments;

import java.util.Map;
import java.util.TreeMap;

public class FindOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		
		//Map input to output
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int output : input) {
			//to find the occurances of each number and the no.of occurances
			if(map.containsKey(output)) {
				
				map.put(output, map.get(output)+1);
			}
			else {
				map.put(output, 1);
			}
		}
		
		//Printing the output
	
	System.out.println(map);
	}

}
