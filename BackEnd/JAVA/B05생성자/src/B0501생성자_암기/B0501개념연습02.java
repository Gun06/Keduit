package B0501생성자_암기;

/*
[암기하시오]

*/

class Product {
	String name;
	int price;
	
	Product() {
		name = "박스";
		price = 1000;
		System.out.println("기본 생성자");
	}
	
	// 생성자 오버로딩(재정의)
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void printProduct() {
		System.out.println(name + " : " + price);
	}
}

public class B0501개념연습02 {
public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.printProduct();
		
		Product p2 = new Product("빈박스", 2000);
		p2.printProduct();
	}
}
