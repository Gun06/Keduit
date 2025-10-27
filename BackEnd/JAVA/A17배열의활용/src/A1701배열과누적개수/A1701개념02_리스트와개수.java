package A1701배열과누적개수;
/*
[리스트와개수]
numberList의 홀수의 개수를 출력해 보겠습니다.
*/
/*
[출력예시]
3
*/
public class A1701개념02_리스트와개수 {
	public static void main(String[] args) {
		int[] numberList = {16, 24, 31, 45, 53};
		int count = 0;
		
		for(int i = 0; i < numberList.length; i++){
			if(numberList[i] % 2 == 1) {
				count += 1;
				
			}
	    }
		System.out.println(count);
	}
}
