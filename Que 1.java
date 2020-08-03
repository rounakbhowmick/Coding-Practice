/*Given an array N, sort it in ascending order till it reaches kth elements and after that sort it in descending order.
Input Size : N <= 100000
Sample Testcase :
INPUT
5 2
4 3 1 2 4
OUTPUT
3 4 4 2 1
*/

import java.util.*;
import java.io.*;

public class main {
	public static void main(String[] args) throws Exception {
		// A Simple Hello World
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int restlistcounter=0;
		ArrayList<Integer> klist = new ArrayList<Integer>(n);
		ArrayList<Integer> restlist = new ArrayList<Integer>(n - k);
		ArrayList<Integer> finallist = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			if (i < k)
				klist.add(Integer.parseInt(br.readLine()));
			else
				restlist.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(klist);
		Collections.sort(restlist, Collections.reverseOrder());

		  for(int i=0;i<n;i++)
		   {
			   if(i<k)
				   finallist.add(klist.get(i));
			   else
			   {
				   finallist.add(restlist.get(restlistcounter));
				   restlistcounter++;
			   }
				 
		   }
		  for(int i=0;i<finallist.size();i++)
		  {
			  System.out.print(finallist.get(i));
			  if(i!=finallist.size()-1)
				  System.out.print(" ");
			  
		  }
	}
}