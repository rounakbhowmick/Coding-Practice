

import java.util.*;

import java.io.*;

public class main {
	public static void main(String[] args) throws Exception {
		// A Simple Hello World

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		// int n = Integer.parseInt(br.readLine());
		int n = sc.nextInt();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < n + n; i++)
			if (i < n) 
				list1.add(sc.nextInt());
			else
				list2.add(sc.nextInt());
		Collections.reverse(list1);
		boolean check = list1.equals(list2);
		if (check)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}