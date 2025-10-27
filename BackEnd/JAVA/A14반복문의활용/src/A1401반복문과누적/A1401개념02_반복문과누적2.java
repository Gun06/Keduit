package A1401반복문과누적;

/*
	[반복문과 누적2]
	앞에서 변수를 사용해 1부터 5까지의 값을 누적하는 과정은 동일한 작업을 반복하는 것이므로,
	이를 반복문을 활용하면 아래와 같이 더 간결하게 표현할 수 있습니다.
 */

public class A1401개념02_반복문과누적2 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i=1; i<=5; i++) {
			total = total + i;
		}
		System.out.println("total = " + total);
		
		// 위 과정을 다시 변수로 풀어서 작성하면 다음과 같습니다.
		int i = 1;
		total = 0;
		
		total = i + total;
		i = i + 1;
		
		total = i + total;
		i = i + 1;
		
		total = i + total;
		i = i + 1;
		
		total = i + total;
		i = i + 1;
		
		total = i + total;
		i = i + 1;
		
		System.out.println("total = " + total);
		
	}
}
