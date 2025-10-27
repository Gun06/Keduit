package A1605배열과삭제;

/*
[리스트 삭제]
	int[] numberList = {10, 20, 30, 40};
	인덱스가 2인값을 삭제하시오.



*/
/*
10
20
40
 */

public class A1605개념01_배열인덱스삭제 {
	public static void main(String[] args) {
		int[] numberList = {10, 20, 30, 40};
	    int index = 0;
		
		for(int i = 0; i < numberList.length;  i++) {
			if(i != 2) {
				numberList[index] = numberList[i];
				index += 1;
			}
		}
		
		for(int i = 0; i < index; i++) {
			System.out.println(numberList[i]);
		}
	}
}
