package B0201클래스;

class Member220101 {
	int number;
	String id;
	String pw;
	String name;
	int score;
}

public class B0201개념01_클래스 {
	public static void main(String[] args) {
		
		
		// 클래스 사용 전
		String[] data = {"1", "qwer", "1234", "김철수", "30"};
		int number = Integer.parseInt(data[0]);
		int score = Integer.parseInt(data[4]);

		// 클래스 사용 후
		Member220101 member = null;
		member = new Member220101();
		member.number = 1;
		member.id = "qwer";
		member.pw = "1234";
		member.name = "김철수";
		member.score = 30;
		
		System.out.println(member.number);
		System.out.println(member.id);
		System.out.println(member.pw);
		System.out.println(member.name);
		System.out.println(member.score);
		
		
	}
}
