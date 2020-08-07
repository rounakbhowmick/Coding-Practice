package code;

//Lilly is creating a search engine called "doodle". Help her to develop a searching algorithm for finding the key element which needs to be searched from the database. If the key element is present in the given string then print it's starting index. Otherwise, print -1.
import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String search=sc.nextLine();
		System.out.println(str.indexOf(search));
	}
}
 