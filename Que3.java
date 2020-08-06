/*Given a number N and an array of N strings,Print yes, if all strings have atleast one vowel in them otherwise print no.
Input Size : N <= 1000
Sample Testcase :
INPUT
5
code
overload
vishal
sundar
anish
OUTPUT
yes*/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

public class main {
	public static void main(String[] args) throws Exception {
		// A Simple Hello World

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String regex = "[aeiouAEIOU]";
		int count = 0;
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<String>(n);
		for (int i = 0; i < n; i++) 
			list.add(br.readLine());
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher;
		for (int i = 0; i < list.size(); i++) {
			matcher = pattern.matcher(list.get(i));
			if (matcher.find()) {
				count++;
				continue;
			} else 
				break;
		}
		if (count == list.size())
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}