package B0202클래스와데이터_개념연습;

import java.util.Arrays;

/*
	[문제]
	item 은 번호 가격 판매개수이다. 
	
	각각의 상품별 번호와 매출을 출력하시오.
	클래스로 변환하시오.
*/
/*
	[출력예시]
	1001 500 3 1500 
	1002 1200 1 1200 
	1003 4300 3 12900 
	1004 2300 4 9200 
	1005 5000 2 10000 

*/

class item220202{
	int number;
	int price;
	int count;
	int total;
}

public class B0202개념연습02 {
	public static void main(String[] args) {

	    int[][] arr = {
	        {1001, 500, 3},
	        {1002, 1200, 1},
	        {1003, 4300, 3},
	        {1004, 2300, 4},
	        {1005, 5000, 2},
	        };
	    
	    item220202[] itemList =new item220202[arr.length];
	    
	    for(int i = 0; i < arr.length; i++) {
	    	item220202 item =new item220202();
	    	item.number = arr[i][0];
	    	item.price = arr[i][1];
	    	item.count = arr[i][2];
	    	item.total = item.price * item.count;
	    	itemList[i] = item;
	    }

	    for(int i = 0; i < itemList.length; i++){
	        System.out.print(itemList[i].number + " ");
	        System.out.print(itemList[i].price + " ");
	        System.out.print(itemList[i].count + " ");
	        System.out.println(itemList[i].total + " ");
	    }
	}
}
