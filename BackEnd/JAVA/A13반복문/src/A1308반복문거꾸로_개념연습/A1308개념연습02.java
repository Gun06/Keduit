package A1308반복문거꾸로_개념연습;
/*
[문제]
반복문을 사용하여 20부터 15까지의 숫자와
그 숫자의 두 배를 바로 옆에 함께 출력하시오.
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
public class A1308개념연습02 {
public static void main(String[] args) {
		int i = 15;
		int num = 20;
		while(i <= 20){
			System.out.println(num + " " + num * 2);
			num -= 1;
			i += 1;
		}
    
	}
}
