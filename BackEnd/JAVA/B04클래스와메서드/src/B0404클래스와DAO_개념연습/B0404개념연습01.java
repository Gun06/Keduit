package B0404클래스와DAO_개념연습;
/*

	[문제]
		전체 데이터출력 
		DAO를 만드시오.
*/

/*
	1001 500 3 1500
	1002 1200 1 1200
	1003 4300 3 12900
	1004 2300 4 9200
	1005 5000 2 10000
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
	void printData() {
		System.out.println(this.number + " " + this.price + " " + this.count + " " + this.total);
	}
}

class ItemDAO{
	Item[] itemList = null;
	
	void setData(int[][] arr) {
		 itemList = new Item[arr.length];
	    
	    for(int i = 0; i < itemList.length; i++) {
	    	Item item = new Item();
	    	
	    	item.Init(arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
	    	itemList[i] = item;
	    }
	}
	void printList() {
		 for(int i = 0; i < itemList.length; i++){
		    	itemList[i].printData();
		    }
	}
	void getSolution(int [] updateData) {
		 for(int i = 0; i < itemList.length; i++){
		    	itemList[i].count += updateData[i];
		    	itemList[i].total = itemList[i].price * itemList[i].count;
		    }
	}
}


public class B0404개념연습01 {
	public static void main(String[] args) {
		 int[][] arr = {
	                {1001, 500, 3, 1500},
	                {1002, 1200, 1 , 1200},
	                {1003, 4300, 3, 12900},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

	    ItemDAO itemDAO = new ItemDAO();
	    itemDAO.setData(arr);
	    itemDAO.printList();
		
	}
}