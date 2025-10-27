package B0308리턴응용_개념연습;

import java.util.Arrays;
/*
[문제]
item 리스트는 상품의 번호이다.
price 리스트는 상품의 가격이다.
count 리스트는 상품의 판매 개수이다.
item과 price와 count 는 한 세트이다.
cancelList는 주문이 취소된 내역으로 
판매 개수와 상품 가격을 업데이트 하시오.
*/ 
/* 
[출력예시]
1001 500 1 500 
1002 1200 0 0 
1003 4300 3 12900 
1004 2300 1 2300 
1005 5000 0 0 

*/


class Item230802{
	int number;
	int price;
	int count;
	int total;
}

public class B0308개념연습02 {
	public static Item230802[]  getSolution(int[][] arr , int[] cancelList){
		Item230802[] itemList = new Item230802[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			Item230802 item = new Item230802();
			item.number = arr[i][0];
			item.price = arr[i][1];
			item.count = arr[i][2];
			item.total = item.price * item.count;
			itemList[i] = item;
		}
		
		for(int i = 0; i < cancelList.length; i++) {
			itemList[i].count -= cancelList[i];
			itemList[i].total = itemList[i].price * itemList[i].count;
		}
		
		
		return itemList;
	}
	
	public static void main(String[] args) {
	    int[][] arr = {
	                {1001, 500, 3, 1500},
	                {1002, 1200, 1 , 1200},
	                {1003, 4300, 3, 12900},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

	    int[] cancelList = {2, 1, 0, 3, 2};
	    Item230802[] re = getSolution(arr , cancelList);
	    
	    for(int i = 0; i < re.length; i++){
	        System.out.print(re[i].number + " ");
	        System.out.print(re[i].price + " ");
	        System.out.print(re[i].count + " ");
	        System.out.print(re[i].total + " ");
	        System.out.println();
	    }
	            
	}
}
