package A1401반복문과누적_문제;

/*
[문제]
반복문을 사용하여 10부터 99까지의 숫자 중,
일의 자리가 5보다 크고 십의 자리가 8보다 큰 숫자들만을 찾아
그 중에서 짝수인 숫자들을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
96 98 
194
*/
public class A1401문제09 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 10; i < 100; i++) {
			int a = i / 10;
			int b = i % 10;
			boolean check1 = a > 8 && b > 5;
			boolean check2 = i % 2 == 0;
			if (check1 && check2) {
				System.out.print(i + " ");
				total += i;
			}
		}
		System.out.println();
		System.out.println(total);

	}
}
