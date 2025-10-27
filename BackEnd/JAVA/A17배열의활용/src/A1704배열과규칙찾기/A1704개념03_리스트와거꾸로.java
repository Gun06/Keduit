package A1704배열과규칙찾기;
/*
[리스트와 거꾸로]
numberList의 값들을 거꾸로 출력해 보겠습니다. 
*/
/*
[출력예시]
60 54 12 44 21
*/
public class A1704개념03_리스트와거꾸로 {
	public static void main(String[] args) {
		int[] numberList = {21, 44, 12, 54, 60};
	    int last = numberList.length - 1;
	    for(int i = 0; i < numberList.length; i++){
	    	System.out.print(numberList[last] + " ");
	        last -= 1;
	    }
	}
}
