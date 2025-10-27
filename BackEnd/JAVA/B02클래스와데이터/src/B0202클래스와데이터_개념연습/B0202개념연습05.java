package B0202클래스와데이터_개념연습;

import java.util.Arrays;
/*
	[문제]
	item 리스트는 상품의 번호이다.
	price 리스트는 상품의 가격이다.
	count 리스트는 상품의 재고 개수이다.
	
	가장 매출이 높은 상품의 번호와 가격을 출력하시오.
	단, 매출이 같은 경우 모두 출력하시오.
*/
/*
	[출력예시]
	10000
	1002 5000 2 10000 
	1005 5000 2 10000 

*/

class ItemA220205{
	int number;
	int price;
	int count;
	int total;
}


public class B0202개념연습05 {
	public static void main(String[] args) {
	    int[][] arr = {
	                {1001, 500, 3, 1500},
	                {1002, 5000, 2 , 10000},
	                {1003, 4300, 2, 8600},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

		

	    ItemA220205[] itemList =new ItemA220205[arr.length];
		    
		    for(int i = 0; i < arr.length; i++) {
		    	ItemA220205 item =new ItemA220205();
		    	item.number = arr[i][0];
		    	item.price = arr[i][1];
		    	item.count = arr[i][2];
		    	item.total = item.price * item.count;
		    	itemList[i] = item;
		    }
		    
		   
		   

    		 int max = itemList[0].total;
		    for(int i = 1; i < itemList.length; i++){
		        
		        if(max <  itemList[i].total){
		            max =  itemList[i].total;
		        }
		    }
		    System.out.println(max);

		    for(int i = 0; i < itemList.length; i++){
		        if( itemList[i].total == max){
		        	  System.out.print(itemList[i].number + " ");
				        System.out.print(itemList[i].price + " ");
				        System.out.print(itemList[i].count + " ");
				        System.out.println(itemList[i].total + " ");
		        }
		    }
	    	    
	    		
	            
	}
}
