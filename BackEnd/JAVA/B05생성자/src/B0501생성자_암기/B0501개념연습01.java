package B0501생성자_암기;
/*
[암기하시오]

*/
class Member{
	int number;
	String name;
	
	void init(int number , String name) {
		this.number = number;
		this.name = name;
	}
	
	Member(){}
	Member(int number, String name){
		this.name = name;
		this.number = number;
	}
}

public class B0501개념연습01 {
	public static void main(String[] args) {
			
		Member m = new Member();
		m.init(1001, "김철수");
	
			
		Member m2 = new Member(1002, "이만수");
	}
}
