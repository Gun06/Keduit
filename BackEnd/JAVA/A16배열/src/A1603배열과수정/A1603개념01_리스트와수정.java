package A1603배열과수정;

import java.util.Arrays;

/*
[리스트와 수정]
리스트는 선언 후에 각각의 방 번호(index)를 이용하여 값을 변경할 수 있습니다.
아래 예제에서 numberList 리스트에서 인덱스가 3에 해당하는 값을 1000으로 변경해보겠습니다.
*/
/*
[출력예시]
[10, 20, 30, 1000]
*/
public class A1603개념01_리스트와수정 {
	public static void main(String[] args) {
		int[] numberList = {10, 20, 30, 40};
	    numberList[3] = 1000;
	    System.out.println(Arrays.toString(numberList));
	}
}
