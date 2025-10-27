package B0308리턴응용_개념;

import java.util.Arrays;

	/*
		[문제]
			item 은 번호 가격 판매개수이다. 			
			각각의 상품중에서 매출이 10000 이상인 상품만 저장해서 반환하는 함수를 만드시오.
	*/
	/*
		[출력예시]
			[1003, 4300, 3]
			[1005, 5000, 2]
	*/
public class B0308개념01_리턴응용 {
	public static int[][] getSolution(int[][] item){
		int[][] re = null;
		int count = 0;
		for(int i = 0; i < item.length; i++) {
			int total = item[i][1] * item[i][2];
			if(total >= 10000) {
				count +=1;
			}
		}
		
		re = new int[count][3];
		int index = 0;
		for(int i = 0; i < item.length; i++) {
			int total = item[i][1] * item[i][2];
			if(total >= 10000) {
				re[index][0] = item[i][0];
				re[index][1] = item[i][1];
				re[index][2] = item[i][2];
				index += 1;
			}
		}
		
		
		return re;
	}
	
	public static void main(String[] args) {

	    int[][] item = {
	        {1001, 500, 3},
	        {1002, 1200, 1},
	        {1003, 4300, 3},
	        {1004, 2300, 4},
	        {1005, 5000, 2},
	        };

	    int[][] re = getSolution(item);
	    
	    for(int i = 0; i < re.length; i++){
	        System.out.println(Arrays.toString(re[i]));
	    }
	}
}
