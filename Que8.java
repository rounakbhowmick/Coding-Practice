package code;
import java.util.*;
//Write a Java program to reverse each word in the given string.
//
//
//
//Input Format:
//
//Input consist of a String.
//
//Output Format:
//
//Output consist of a String.
//
//
//
//Sample Input:
//
//My Name is Khan
//
//Sample Output:
//
//yM emaN si nahK


public class Main
{
    public static void main(String[] a)
    {
        //Your code here
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		ArrayList<String>list=new ArrayList<String>();
		ArrayList<String>finallist=new ArrayList<String>();
		String strarr[]=str.split(" ");
		for(int i=0;i<strarr.length;i++)
		{
			list.add(strarr[i]);
		}
		for(int k=0;k<list.size();k++)
		{
			String rev="";
			String temp=list.get(k);
			for(int i=temp.length()-1;i>=0;i--)
			{
				rev=rev+temp.charAt(i);
			}
			finallist.add(rev);
		}
	for(int z=0;z<finallist.size();z++)
	{
		System.out.print(finallist.get(z));
		System.out.print(" ");
	}
    }
}

 