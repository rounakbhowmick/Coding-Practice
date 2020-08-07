package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//Parenthesis check without stack

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		int start = 0,end=0;
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> booleanlist = new ArrayList<String>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			String[] strarr = str.split("");
			for (int j = 0; j < strarr.length; j++) {
				list.add(strarr[j]);
			}
			for (int l = 0; l < list.size(); l++) {
				String temp = list.get(l);
				if ((temp.contentEquals("(")) || (temp.contentEquals("{")) || (temp.contentEquals("["))) {
					start++;
				}
				else
					end++;
			}
			if(start==end)
			{
				booleanlist.add("true");
				start=0;
				end=0;
				list.clear();
			}
			else
			{
				booleanlist.add("false");
				start=0;
				end=0;
				list.clear();
			}
		}
		
		
		for(int z=0;z<booleanlist.size();z++)
		{
			System.out.println(booleanlist.get(z));
		}
	}
}