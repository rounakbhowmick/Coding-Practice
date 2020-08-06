//Count total number of digits from 1 to n
//1. John has an important task – he needs to number the books in the bookshelf, putting a tag with a number on each book. Each of the n numbers of books should have a number from 1 to n, and, of course, different books should get different numbers.
//John wants to know how many digits he has to write down while numbering all those tags.
//Input
//The first line contains an integer n – the number of books in the class bookshelf
//Output
//Output the number of digits needed to number all the books.
import java.util.*;
import java.io.*;

public class main {
	public static void main(String[] args) throws Exception {
		// A Simple Hello World
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println("test");
		long n = Long.parseLong(br.readLine());
		long temp = 0;
		int number_of_digits = 0; 
	    for (int i = 1; i <= n; i *= 10) 
	    {
	    	number_of_digits += (n - i + 1);
	    	System.out.println(number_of_digits);
	    }
	        
		//System.out.println(number_of_digits);

	}
}