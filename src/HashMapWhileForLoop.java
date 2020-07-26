import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapWhileForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is HashMap programining 
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(2,"deb");
		map.put(3, "Aditi");
		map.put(5,"Rupa");
		System.out.println(map.size());
		System.out.println("While Loop");
		Iterator itr = map.entrySet().iterator();
		 while (itr.hasNext()) {
			 Map.Entry me = (Map.Entry) itr.next();
			 System.out.println("key is " + me.getKey() + 
					            " value is " + me.getValue());
		 }
        System.out.println(" Welcome to Hashmap For Loop");
        for(Map.Entry me2: map.entrySet()) {
        	
        	System.out.println("Key is " + me2.getKey() + 
        			           " Vale is " +me2.getValue());
        }
        
	}

}
