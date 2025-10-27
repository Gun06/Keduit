package B0202클래스와데이터;

class Member200201{
	int number; 
	String id; 
	String pw; 
	String name; 
	int score;
}

public class B0202개념01_기본이론1 {
	public static void main(String[] args) {
		
	
		
		// 이배열은 머리만 만든것으로 데이터가 들어있지않다. 
		Member200201[] memberList = new Member200201[2];
		System.out.println(memberList[0]);
		System.out.println(memberList[1]);
		
		Member200201 m1 = new Member200201();
		m1.number = 1001;
		m1.id = "qwer";
		m1.pw = "1234";
		m1.name = "김철수";
		m1.score = 10;
		memberList[0] = m1;
		
		Member200201 m2 = new Member200201();
		m2.number = 1002;
		m2.id = "asdf";
		m2.pw = "2345";
		m2.name = "이영희";
		m2.score = 30;
		memberList[1] = m2;
		
		for(int i=0; i<memberList.length; i++) {
			System.out.println(memberList[i].name);
		}
		
	}
}







