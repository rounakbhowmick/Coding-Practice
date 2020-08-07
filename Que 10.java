package code;

//Write a Java program to merge given two sorted arrays such that the elements are not repeated.
//
//
//
//Input format :
//
//Input consist of an Integer.
//
//Output format :
//
//Output consist of an Integer.
//
//
//
//Sample Input:
//
//Size: 8
//
//Array 1: 2, 4, 5, 6, 7, 9, 10, 13
//
//Size: 10
//
//Array 2: 2, 3, 4, 5, 6, 7, 8, 9, 11, 15
//
//
//
//Sample Output:
//
//2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15
//
//import java.util.*;
class Main{
  public static void main(String args[]){
    // Type your code here
	  Scanner sc=new Scanner(System.in);
	  int n1=sc.nextInt();
	  ArrayList<Integer> list1=new ArrayList<Integer>();
	  ArrayList<Integer> list2=new ArrayList<Integer>();
	  for(int i=0;i<n1;i++)
		  list1.add(sc.nextInt());
	  int n2=sc.nextInt();
	for(int i=0;i<n2;i++)
	{
		list2.add(sc.nextInt());
	}
	  list1.addAll(list2);
	  HashSet<Integer> set=new HashSet<Integer>(list1);
	  ArrayList<Integer> sortedlist=new ArrayList<Integer>(set);
	  Collections.sort(sortedlist);
	for(int i=0;i<sortedlist.size();i++)
	{
		System.out.print(sortedlist.get(i));
		if(i!=set.size()-1)
	 	 System.out.print(" ");
	}
	}
}