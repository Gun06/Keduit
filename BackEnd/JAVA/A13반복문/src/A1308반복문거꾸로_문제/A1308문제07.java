package A1308반복문거꾸로_문제;
/*
[문제]
for문을 사용하여 20부터 15까지 숫자와 그 숫자의 두배를 출력하시오.
*/
/*
[출력예시]
20 40
19 38
18 36
17 34
16 32
15 30
*/
public class A1308문제07 {
	public static void main(String[] args) {
		int num = 20;
		for(int i = 15; i < 21; i++){
			System.out.println(num + " " + num * 2 );
			num -= 1;
		}
	}
}
