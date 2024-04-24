package pack;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListPgm {

	public static void main(String[] args) {
	 ArrayList<String>al=new ArrayList<String>();
	 al.add("Bincy");
	 al.add("Reshma");
	 al.add("Arya");
	 al.add("Nayana");
	 System.out.println(al);
	 
	 String a=al.get(2);
	 System.out.println(a);
	 
	 Boolean b=al.contains("Bincy");
	 System.out.println(b);
	 
	 int c=al.size();
	 System.out.println(c);
	 
	 al.remove(2);
	 System.out.println(al);
	 
	 Iterator<String> itr=al.iterator();
	 while(itr.hasNext())
	 {
		 String s=itr.next();
		 System.out.println(s);
	 }
	 
	 for(String ob:al)
	 {
		 System.out.println(ob);
	 }
	 int arr[]= {10,20,25,55};
	 for(int i:arr)
	 {
		 System.out.println(i);
	 }
	}

}

