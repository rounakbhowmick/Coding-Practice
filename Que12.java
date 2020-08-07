package code;

//Write a Java program to find the sum of power of digits.
//Sample Input:
//
//582109
//
//
//
//Sample Output:
//
//390692
//
//
//
//Hint:
//
//5^8+8^2+2^1+1^0+0^9+9^0 = 390692
import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strarr = str.split("");
		double result = 0;
		int next = 0;
		for (int i = 0; i < strarr.length - 1; i++) {
			int intvalue = Integer.parseInt(strarr[i]);
			next = Integer.parseInt(strarr[i + 1]);
			result += Math.pow(intvalue, next);
		}
		System.out.println(result);
	}
}