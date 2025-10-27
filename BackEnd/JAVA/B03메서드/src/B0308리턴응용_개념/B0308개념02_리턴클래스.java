package B0308리턴응용_개념;


	/*
		[문제]
			item 은 번호 가격 판매개수이다. 			
			클래스로 변환해서 반환하는 함수를 만드시오.
	*/
	/*
		[출력예시]
			[1003, 4300, 3]
			[1005, 5000, 2]
	*/
class Item230801{
	int number;
	int price;
	int count;
}
public class B0308개념02_리턴클래스 {
	public static Item230801[]  getClassList(int[][] arr){
		Item230801[] itemList = new Item230801[arr.length];
		

		for(int i = 0; i < arr.length; i++) {
			Item230801 item = new Item230801();
			item.number = arr[i][0];
			item.price = arr[i][1];
			item.count = arr[i][2];
			itemList[i] = item;
		}
		
		
		return itemList;
	}
	
	public static void main(String[] args) {

	    int[][] arr = {
	        {1001, 500, 3},
	        {1002, 1200, 1},
	        {1003, 4300, 3},
	        {1004, 2300, 4},
	        {1005, 5000, 2},
	        };

	    Item230801[] re = getClassList(arr);
	    
	    for(int i = 0; i < re.length; i++){
	        System.out.print(re[i].number + " ");
	        System.out.print(re[i].price + " ");
	        System.out.print(re[i].count + " ");
	        System.out.println();
	    }
	}
}
