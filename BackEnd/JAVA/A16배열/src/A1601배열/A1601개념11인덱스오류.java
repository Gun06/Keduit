package A1601배열;
/*
[리스트와 인덱스 오류]
리스트에서 존재하지 않는 인덱스를 사용하면 오류가 발생합니다. 
이때 발생하는 오류는 IndexError: list index out of range입니다.
예를 들어, 아래의 리스트는 4개의 요소(인덱스는 0, 1, 2, 3)를 가지고 있습니다. 
만약 변수[4]로 접근하려 하면, 리스트 범위를 벗어나기 때문에 오류가 발생합니다.
*/
public class A1601개념11인덱스오류 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40}; 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]); // 여기서 오류가 발생한다.
	}
}
