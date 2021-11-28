package colections;

import java.util.ArrayList;
import java.util.Collections;

public class Sum0fDuplicates {

	public static void main(String[] args) {
		int sum_of_duplicate =0;
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(12);
		a1.add(13);
		a1.add(13);
		a1.add(12);
		a1.add(112);
		a1.add(13);
		
		Collections.sort(a1);
		System.out.println(a1);
		for (int i=1;i<a1.size();i++ )
		{
			System.out.println(a1.get(i)+"=="+a1.get(i-1));
			if(a1.get(i)==a1.get(i-1))
				sum_of_duplicate=sum_of_duplicate+a1.get(i)+a1.get(i-1);
			System.out.println(sum_of_duplicate);
		}
		System.out.println(sum_of_duplicate);
		
	}
}
