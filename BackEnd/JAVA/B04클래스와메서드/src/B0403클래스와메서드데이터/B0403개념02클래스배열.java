package B0403클래스와메서드데이터;

class User{
	String name;
	int score;
	
	void init(String name, int score) { 
		this.name = name; 
		this.score = score;
	}
	
	void printData() {
		System.out.println(name  + " : " + this.score);
	}
}


public class B0403개념02클래스배열 {
	public static void main(String[] args) {
		
		User[] list = new User[3];
		for(int i = 0; i < list.length; i++) {
			list[i] = new User();
		}
		list[0].init("김철수",100); 
		list[1].init("이만수",20);
		list[2].init("박영희",70);
		
		for(int i = 0 ; i < list.length; i++) {
			list[i].printData();
		}
		
	}
}
