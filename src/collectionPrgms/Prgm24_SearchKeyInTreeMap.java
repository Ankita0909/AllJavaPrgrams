package collectionPrgms;

import java.util.Set;
import java.util.TreeMap;

public class Prgm24_SearchKeyInTreeMap {

public static void main(String[] args) {
		
	
		TreeMap<Integer,String> m1=new TreeMap<Integer,String>();
		m1.put(10,"one");
		m1.put(20,"two");
		m1.put(30,"three");
		m1.put(40,"two");
		m1.put(50,"five");
		
		System.out.println("TreeMap contains = "+m1);

		Set<Integer> key = m1.keySet();
		System.out.println("Keys are = "+key);
	  
	}
}
