package code;

import java.util.*;

import java.io.*;

public class main {
	static int sum = 1;

	public static void main(String[] args) throws Exception {
		// A Simple Hello World

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		// int n = Integer.parseInt(br.readLine());
		int n = sc.nextInt();
		 hour(n);
		//System.out.println(value);
	}

	static void hour(int km) {
		// int sum = 0;
		km = km - 5;
		// System.out.println(km);
		if (km > 5) {
			sum += 1;
			// System.out.println(sum);
			hour(km);
		} else if (km == 0 || km<0)
			System.out.println(sum);
		else {
			sum++;
			System.out.println(sum);
//			return sum;
		}
//		return 0;
	}
}


//Or
public static void main(String[] args) throws Exception {
		// A Simple Hello World

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int km=5;
		// int n = Integer.parseInt(br.readLine());
		int n = sc.nextInt();
		while(true)
		{
			if(n==0) break;
			sum+=n/km;
			n=n%km;
			km--;
		}
		System.out.println(sum);
	}

	