

package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] array = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> values = new LinkedHashSet<Integer>();

		for (Integer result : array) {   //  Adding integer array data into Set

			if ((values.add(result) == false)) {

				System.out.println("The duplicate values are: " + result);
			}
		}
	}
}