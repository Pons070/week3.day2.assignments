package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "We learn java basics as part of java sessions in java week1";
		
		//to split the string
		
String[] splitText = input.split(" ");

//adding String to Duplicates

Set<String> duplicates = new LinkedHashSet<String>();

for (String text : splitText) {
	
	duplicates.add(text);
}

//Printing the string after removing duplicates and converting duplicates to String

System.out.println(String.join(" ", duplicates));
} 
	}
