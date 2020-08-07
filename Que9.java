package code;

import java.util.*;
//Given 2 numbers N,K and an array of N integers, find if the element K exists in the array.
//Input Size : N <= 100000
//Sample Testcase :
//INPUT
//5 2
//1 2 3 4 5
//OUTPUT
//yes
public class Main {
	public static void main(String[] a) {
		// Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int search = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		if (list.contains(search))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
