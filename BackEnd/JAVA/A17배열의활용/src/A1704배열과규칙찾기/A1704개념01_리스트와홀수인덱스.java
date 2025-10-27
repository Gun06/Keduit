package A1704배열과규칙찾기;
/*
[리스트와 홀수 인덱스]
numberList의 홀수 인덱스에 해당하는 값만 출력해 보겠습니다.
*/
/*
[출력예시]
44 54
*/
public class A1704개념01_리스트와홀수인덱스 {
	public static void main(String[] args) {
		int[] numberList = {21, 44, 12, 54, 60};
	    for(int i = 0; i < numberList.length; i++){
	        if(i % 2 == 1){
	        	System.out.println(numberList[i] + " ");
	        }
	    }
	}
}
