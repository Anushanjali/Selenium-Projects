package JavaPackage;

import java.util.HashMap;
import java.util.Map;

public class Avg {
	public static void main(String a[]){
       Map< Integer, Integer> hm = new HashMap< Integer,  Integer>();
        //add key-value pair to hashmap
        hm.put(1, 100);
        hm.put(1, 200);
        hm.put(4,300);
        hm.put(5, 400);
        hm.put(6, 500);
        hm.put(7,600);
        System.out.println(hm);
        
		System.out.println(hm.get("2"));
        
}
}