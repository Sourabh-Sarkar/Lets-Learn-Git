package colections;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Sourabh");
		a1.add("Sourabh");
		a1.add("Raju");
		a1.add("Sourabh");
		a1.add("Matt");
		a1.add("Drew");
		System.out.println(a1);
		a1.add(0,"Asish");
		System.out.println(a1);
		a1.set(1,"Brian");
		System.out.println(a1);
		System.out.println("Index of Sourabh:"+ a1.lastIndexOf("Sourabh"));
		
		//for Each
		for(String S:a1)
			System.out.println(S);
		//Iterator
		Iterator<String> i=a1.iterator();
		while(i.hasNext())
		System.out.println(i.next());
	}
}