package A1402반복문과개수_문제;

/*
[문제]
반복문을 사용하여 24의 약수를 찾고,
그 개수를 출력하시오.
*/
/*
[출력예시]
1 2 3 4 6 8 12 24 
8
*/
public class A1402문제01 {
	public static void main(String[] args) {
		int count = 0;
		int num = 24;
		for (int i = 1; i < 25; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
