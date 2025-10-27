package B0403클래스와메서드데이터;

class Product{
	String name;
	int price;
	
	void init(String name , int price) {
		this.name = name;
		this.price = price;
	}
	
	void printData() {
		System.out.println(name + " " + price);
	}
}

public class B0403개념01클래스배열 {
	public static void main(String[] args) {
				
		// 클래스 = 사용자 정의 데이터 타입
		int[]     list   = new int[2];
		
		//                 Product 클래스 데이터타입을
		//				   저장할 방 2개를 생성해줘~
		//				   아직 Product 클래스가 생성된 것은 X
		Product[] prList = new Product[2];
		System.out.println(prList[0]);	// null
		System.out.println(prList[1]);	// null
		
		// 아래 두 줄의 코드를 잊지말고 꼭 작성하자!
		prList[0] = new Product();
		prList[1] = new Product();
		
		prList[0].name = "새우깡";
		prList[1].name = "고래밥";		
		prList[0].price = 1000;
		prList[1].price = 2000;		
			
		for(int i = 0; i < prList.length; i++) {
			prList[i].printData();
		}
		System.out.println("----------------------");
		
		Product[] prList2 = new Product[2];
		prList2[0] = new Product();
		prList2[1] = new Product();
		
		prList2[0].init("새우깡", 1000);
		prList2[1].init("고래밥", 2000);
		
		for(int i = 0; i < prList.length; i++) {
			prList2[i].printData();
		}
		
	}
}