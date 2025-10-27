package B0403클래스와메서드데이터_개념연습;


/*
	[문제]
    int[] updateData = {5, 4, 3, 1, 1}; 은 오늘 주문 이 추가된 개수이다
  	수량 과 총합을 수정하시오.
  
*/
/*
		1001 500 8 4000
		1002 1200 5 6000
		1003 4300 6 25800
		1004 2300 5 11500
		1005 5000 3 15000
 */

public class B0403개념연습02 {
	public static void main(String[] args) {
		 int[][] arr = {
	                {1001, 500, 3, 1500},
	                {1002, 1200, 1 , 1200},
	                {1003, 4300, 3, 12900},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

	    Item[] itemList = new Item[arr.length];
	    
	    for(int i = 0; i < itemList.length; i++) {
	    	Item item = new Item();
	    	item.Init(arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
	    	itemList[i] = item;
	    }
	    
	    int[] updateData = {5, 4, 3, 1, 1};
	    
	    for(int i = 0; i < itemList.length; i++){
	    	itemList[i].count += updateData[i];
	    	itemList[i].total = itemList[i].price * itemList[i].count;
	    }
	    
	    for(int i = 0; i < itemList.length; i++){
	    	itemList[i].printData();
	    }
		
	}
}