package collectionPrgms;

import java.util.HashMap;

public class Prgm18_EntrySetfrmHashMap {

	public static void main(String[] args) {
			
			HashMap<Integer,String> m1=new HashMap<Integer,String>();
			m1.put(10,"one");
			m1.put(20,"two");
			m1.put(30,"three");
			m1.put(40,"two");
			m1.put(50,"five");
			
			System.out.println("Map contains = "+m1);
	
			System.out.println("Enty Set = "+m1.entrySet());
		}	
}
