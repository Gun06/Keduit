package B1205맵_개념;

import java.util.HashMap;
import java.util.Map;

public class B1205개념02_맵 {
	public static void main(String[] args) {

		/*
		 * 	Map은 자바스크립의 Json과 동일한 기능을한다.
		 * 	
		 * 
		 * 	 a = {"score" : 10 , "name" : "김철수"};
		 * 
		 * 	key => 배열의 index 와 같은역활
		 *  value => 배열의 value 와 같은역활
		 */
		
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("apple", 1000);
		hmap.put("orange" , 1500);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		
		/*
		 * 	arr[0] = 1000
		 *  arr[1] = 1500
		 *  arr[2] = 5000
		 *  arr[3] = 15000
		 *  
		 *  arr["apple"] = 1000
		 *  arr["orange"] = 1500
		 *  arr["melon"] = 5000
		 *  arr["water melon"] = 15000
		 * 
		 */
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
		
		System.out.println(hmap.get("melon"));
		System.out.println("============================================================");
		
		// arr[0] = 1234;
		//  arr["apple"] = 1234;
		hmap.put("apple", 1234);
		System.out.println(hmap.size() + " : " + hmap);
		
		System.out.println("============================================================");
		
		
		System.out.println(hmap.keySet());
		
		int sum = 0;
		for(String key : hmap.keySet()) {
//			System.out.println(key);				// HashMap의 모든 key를 얻어올 수 있다.
			System.out.println(hmap.get(key));		// HashMap의 모든 key에 할당된 value를 얻어올 수 있다.
			sum += hmap.get(key);
		}
		System.out.println("금액 합계 : " + sum);
		System.out.println("============================================================");
		
		hmap.remove("apple");
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
		
		hmap.clear();
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
	}
}
