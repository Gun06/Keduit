package A1401반복문과누적_문제;

/*
[문제]
반복문을 사용하여 100부터 200까지의 숫자 중,
십의 자리가 2이고 짝수인 숫자들만을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
120 122 124 126 128 
620
*/
public class A1401문제06 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 100; i < 201; i++) {
			int a = i % 100 / 10;
			boolean check1 = a == 2;
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
