package A1601배열;
/*
[리스트 길이와 내장 함수 len]
len() 함수는 리스트의 길이, 즉 리스트에 포함된 요소의 개수를 반환합니다.
이를 통해 리스트의 크기를 동적으로 파악하여 반복문에서 사용할 수 있습니다.
*/
public class A1601개념05배열의길이 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40}; 
		int size = arr.length;
		System.out.println(size);
		
		for(int i = 0; i < arr.length;  i++) {
			System.out.println(arr[i]);
		}
	}
}
