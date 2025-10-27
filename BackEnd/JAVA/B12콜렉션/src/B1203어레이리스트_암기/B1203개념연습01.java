package B1203어레이리스트_암기;

import java.util.Vector;

class Item{
	private int number;
	private int price;
	private int count;
	private int total;
	
	public Item(){};
	public Item(int number, int price, int count, int total){
		this.number = number;
		this.price = price;
		this.count = count;
		this.total = total;
	};
	
	public void setNumber(int number) {
		this.number = number;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getNumber() {
		return number;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	public int getTotal() {
		return total;
	}
	
	
	public void printData() {
		System.out.println(this.number + " " + this.price + " " + this.count + " " + this.total);
	}
}
/*
	 -------------------
	1001 500 3 1500
	1002 1200 1 1200
	1003 4300 3 12900
	1004 2300 4 9200
	1005 5000 2 10000
	-------------------
	1001 500 3 1500
	1002 1200 1 1200
	1003 4300 3 12900
	1004 2300 4 9200
	1005 5000 2 10000
	1006 4500 3 13500
	-------------------
	1001 500 6 3000
	1002 1200 8 9600
	1003 4300 7 30100
	1004 2300 5 11500
	1005 5000 4 20000
	1006 4500 7 31500
	-------------------
	1003 4300 7 30100
	1005 5000 4 20000
	1006 4500 7 31500 
 
 */

public class B1203개념연습01 {
	public static void main(String[] args) {
		 int[][] arr = {
	                {1001, 500, 3, 1500},
	                {1002, 1200, 1 , 1200},
	                {1003, 4300, 3, 12900},
	                {1004, 2300, 4 , 9200},
	                {1005, 5000, 2 , 10000},
	                };

		 	//[1] 클래스로 변경하시오.
		 	Vector<Item> itemList= new Vector<Item>();
		 	
		 	for(int i = 0; i < arr.length; i ++) {
		 		Item item = new Item(arr[i][0] , arr[i][1] , arr[i][2] , arr[i][3]);
		 		itemList.add(item);
		 	}
		 
		 	System.out.println("-------------------");
		 	for(int i = 0; i < itemList.size(); i++) {
		 		itemList.get(i).printData();
		 	}
		 	
		 	
		 	
			//[2] 1006 , 4500 , 3 , 13500  을 추가하시오.
		 	Item item = new Item(1006, 4500, 3, 13500);
		 	itemList.add(item);
		 	System.out.println("-------------------");
		 	for(int i = 0; i < itemList.size(); i++) {
		 		itemList.get(i).printData();
		 	}

			//[3] updateCount = {3,7,4,1,2,4} 을 추가하시오.		
		 	int[] updateCount = {3,7,4,1,2,4};
			for(int i = 0; i < updateCount.length; i++) {
				int count = itemList.get(i).getCount();
				itemList.get(i).setCount(count + updateCount[i]);
				int total = itemList.get(i).getPrice() * itemList.get(i).getCount();
				itemList.get(i).setTotal(total);
			}
			System.out.println("-------------------");
		 	for(int i = 0; i < itemList.size(); i++) {
		 		itemList.get(i).printData();
		 	}
			
			//[4] 매출이 15000 이하는 전부 삭제하시오.
			
		 	int n = 0;
		 	while(true) {
		 		if(n == itemList.size()) {
		 			break;
		 		}
		 		if(itemList.get(n).getTotal() <= 15000) {
		 			itemList.remove(n);
		 		}else {
		 			n += 1;
		 		}
		 	}
		 	
			System.out.println("-------------------");
		 	for(int i = 0; i < itemList.size(); i++) {
		 		itemList.get(i).printData();
		 	}
		 	
	}
}