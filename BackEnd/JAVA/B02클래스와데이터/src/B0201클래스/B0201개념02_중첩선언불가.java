package B0201클래스;


/*
	같은 패키지 안의 클래스는
	다른 클래스에서 사용할 수 있다.

	같은 패키지 내에서는
	클래스를 중복해서 사용할 수 없다.
*/

/*
	class Member220101 {
		int number;
		String id;
		String pw;
		String name;
		int score;
	}
 */


public class B0201개념02_중첩선언불가 {
	public static void main(String[] args) {
		
		// 다음파일에서도 이전파일클래스는 사용할수있다. 
		Member220101 member = new Member220101();
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
