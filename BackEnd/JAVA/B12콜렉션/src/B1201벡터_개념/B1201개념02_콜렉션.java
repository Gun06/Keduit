package B1201벡터_개념;

import java.util.Vector;

public class B1201개념02_콜렉션 {
	public static void main(String[] args) {		
		//int[] arr  = new int[무한대];
		Vector<Integer> vec = new Vector<Integer>();	
		/*
		 * add		=> 추가
		 * remove   => 삭제
		 * clear    => 초기화
		 * size     => 개수
		 * get	    => [0]
		 * set		=> [0] = 10;
		 */
		
		vec.add(10);				// arr[0] = 10;
		System.out.println(vec);
		vec.add(20);				// arr[1] = 20;
		System.out.println(vec);
		vec.add(30);				// arr[2] = 30;
		System.out.println(vec);
		
		vec.remove(0);				
		System.out.println(vec);
		
		//vec.clear();
		//System.out.println(vec);
		
		int size = vec.size();		// arr.length
		System.out.println(size);
		
		int a = vec.get(0);			// arr[0]
		System.out.println(a);
		
		vec.set(0, 100);			// arr[0] = 100;
		System.out.println(vec);
		
		vec.clear();
		System.out.println(vec);
		
	}
}