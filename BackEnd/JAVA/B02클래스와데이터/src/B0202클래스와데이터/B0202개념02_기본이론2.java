package B0202클래스와데이터;

class Member220202{
	int number; 
	String id; 
	String pw; 
	String name; 
	int score;
}
 

public class B0202개념02_기본이론2 {
	public static void main(String[] args) {
		
		// 클래스 배열은 2차원배열과 비슷한 구조이다.
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[3];
		arr[2] = new int[3];
		
		
		Member220202[] memberList = new Member220202[3];
		memberList[0] = new Member220202();
		memberList[1] = new Member220202();	
		memberList[2] = new Member220202();	
		
	}
}









