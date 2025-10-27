package B0308리턴응용_개념연습;


/*
		[문제]
			item 은 번호 가격 판매개수이다. 				
			(문제1) 	
			10000 이상인 상품만 저장해서 반환하는 함수를 만드시오.
			단, 클래스로 변환해서 반환하는 함수를 만드시오.
			(문제2)
			클래스내용을 출력해주는 함수를 만드시오.
	*/
	/*
		[출력예시]
			1003 4300 3 
			1005 5000 2 
	*/
class Item230801{
	int number;
	int price;
	int count;
}
public class B0308개념연습01 {
		
	public static Item230801[]  getSolution(int[][] arr){
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			int total = arr[i][1] * arr[i][2];
			if(total >= 10000) {
				count +=1;
			}
		}
			
		Item230801[] itemList = new Item230801[count];
		
		int index = 0;

		for(int i = 0; i < arr.length; i++) {
			int total = arr[i][1] * arr[i][2];
			if(total >= 10000) {
				Item230801 item = new Item230801();
				item.number = arr[i][0];
				item.price = arr[i][1];
				item.count = arr[i][2];
				itemList[index] = item;
				index += 1;
			}
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

	    Item230801[] re = getSolution(arr);
	    
	    for(int i = 0; i < re.length; i++){
	        System.out.print(re[i].number + " ");
	        System.out.print(re[i].price + " ");
	        System.out.print(re[i].count + " ");
	        System.out.println();
	    }
	}
}
