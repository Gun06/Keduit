package A1401반복문과누적_문제;

/*
[문제]
반복문을 사용하여 30의 약수를 구한 뒤,
그 약수들을 모두 더한 값을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
1 2 3 5 6 10 15 30 
72
*/
public class A1401문제01 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i < 31; i++) {
			if (30 % i == 0) {
				System.out.print(i + " ");
				total += i;
			}
		}
		System.out.println();
		System.out.println(total);
	}
}