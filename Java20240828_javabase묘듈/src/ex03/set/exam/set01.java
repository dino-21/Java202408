package set.exam;

import java.util.HashSet;
import java.util.Set;

public class set01 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(new Integer(10));  // 권장하지 않음
		set.add(10); 
		set.add(20);
		set.add(30);
		set.add(30);
		
		for(Integer num : set)
			System.out.println(num);
	}

}
