package A1704배열과규칙찾기_개념연습;

import java.util.Arrays;

/*
[문제] 
	a의 값을 순차적으로 c에 저장하고,
	그 후 b의 값을 c의 그 뒤부터 저장하시오.

*/
/*
[정답] 
 	a = [10,20,30]
	b = [40,50,60]
	
	c = [10,20,30,40,50,60]
*/
public class A1704개념연습05 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		int[] b = {40, 50, 60};

		int[] c = new int[6];
		int index = 0;

		for(int i = 0; i < a.length; i++){
			c[index] = a[i];
			index += 1;
		}
		for(int i = 0; i < b.length; i++){
			c[index] = b[i];
			index += 1;
		}
		System.out.println(Arrays.toString(c));
	}
}
