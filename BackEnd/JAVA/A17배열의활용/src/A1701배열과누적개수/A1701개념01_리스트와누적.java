package A1701배열과누적개수;
/*
[리스트와 누적]
numberList의 전체 합을 출력해 보겠습니다.
*/
/*
[출력예시]
150   
*/
public class A1701개념01_리스트와누적 {
	public static void main(String[] args) {
		int[] numberList = {10, 20, 30, 40, 50};
		int total = 0;
		
		for(int i = 0; i < numberList.length; i++){
	        total += numberList[i];
	    }
		System.out.println(total);

	}
}
