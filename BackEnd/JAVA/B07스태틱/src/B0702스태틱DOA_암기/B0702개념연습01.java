package B0702스태틱DOA_암기;

/*
 * [암기하시오]
 */
/*
int[] updateData = {5, 4, 3, 1, 1}; 은 오늘 주문 이 추가된 개수이다
수정후 총매출 다시 출력 
*/
/*
1001 500 3 1500
1002 1200 1 1200
1003 4300 3 12900
1004 2300 4 9200
1005 5000 2 10000
-----------
1001 500 8 4000
1002 1200 5 6000
1003 4300 6 25800
1004 2300 5 11500
1005 5000 3 15000
*/
class Item{
	int number;
	int price;
	int count;
	int total;
	
	void Init(int number, int price, int count, int total) {
		this.number = number;
		this.price = price;
		this.count = count;
		this.total = total;
	}
	
	void setNumber(int number) {
		this.number = number;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void setCount(int count) {
		this.count = count;
	}
	void setTotal(int total) {
		this.total = total;
	}
	int getNumber() {
		return number;
	}
	int getPrice() {
		return price;
	}
	int getCount() {
		return count;
	}
	int getTotal() {
		return total;
	}
	
	void printData() {
		System.out.println(this.number + " " + this.price + " " + this.count + " " + this.total);
	}
}

class ItemDAO{
	static Item[] itemList = null;
	
	static void setData(int[][] arr) {
		 itemList = new Item[arr.length];
	    
	    for(int i = 0; i < itemList.length; i++) {
	    	Item item = new Item();
	    	
	    	item.Init(arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
	    	itemList[i] = item;
	    }
	}
	static void printList() {
		 for(int i = 0; i < itemList.length; i++){
		    	itemList[i].printData();
		    }
	}
	static void getSolution(int [] updateData) {
		 for(int i = 0; i < itemList.length; i++){
			 int count = itemList[i].getCount();
			 itemList[i].setCount(count + updateData[i]);
			 
			 int total = itemList[i].getPrice() * itemList[i].getCount();
			 itemList[i].setTotal(total);
			 
		 }
	}
}


public class B0702개념연습01 {
	public static void main(String[] args) {
		 int[][] arr = {
	                {1001, 500, 3, 1500},
	                {1002, 1200, 1 , 1200},
	                {1003, 4300, 3, 12900},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

	    //ItemDAO itemDAO = new ItemDAO();
		 ItemDAO.setData(arr);
		 ItemDAO.printList();
	    int[] updateData = {5, 4, 3, 1, 1};
	    ItemDAO.getSolution(updateData);
	    
	    System.out.println("-----------");
	    ItemDAO.printList();
		
	}
}