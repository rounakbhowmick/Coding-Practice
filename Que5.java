package code;
//Displaying name with Frequency
import java.util.*;

import java.io.*;
//Displaying name with freq
public class main {

	public static void main(String[] args) throws Exception {
		// A Simple Hello World

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String strarr[]=str.split(" ");
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(strarr));
		LinkedHashSet<String> hashSet = new LinkedHashSet<>(list);
		ArrayList<String> listWithoutDuplicates = new ArrayList<String>(hashSet);
		for(int i=0;i<listWithoutDuplicates.size();i++)
		{
			System.out.println(listWithoutDuplicates.get(i) +" "+ Collections.frequency(list,listWithoutDuplicates.get(i)));
		}

	}
}