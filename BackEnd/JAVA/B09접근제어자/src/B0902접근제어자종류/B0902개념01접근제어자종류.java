package B0902접근제어자종류;

//접근제어자 종류
//1) public  	: 모든 클래스에서 사용가능 
//2) protected  : 패키지가 같으면 public, 
//				  패키지가 다르면 자식클래스에서는 public 
//				  자식클래스가 아니면 private 
//3) default 	: 패키지가 같으면 public, 
//				  패키지가 다르면 private 
//[주의] : default 는 사용하지 않는것이 좋다.
//4) private 	: 내부 클래스에서만 사용가능, 타 클래스에서 사용불가 

public class B0902개념01접근제어자종류 {
	
	private int a;
	public int b;
	protected int c;
	int d; // default 는 사용하지않는게 좋다.
	
}
