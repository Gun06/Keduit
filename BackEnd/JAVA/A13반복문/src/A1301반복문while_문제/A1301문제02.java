package A1301반복문while_문제;
/*
[문제]
반복문을 사용하여 1부터 5까지의 숫자와
그 숫자의 두 배를 바로 옆에 함께 출력하시오.
*/
/*
[출력예시]
1 2
2 4
3 6
4 8
5 10
*/
public class A1301문제02 {
public static void main(String[] args) {
	 	int i = 1;
	 	while(i <=5 ) {
	 		System.out.println(i + " " + 2*i);
	 		i += 1;
	 	}
	}
}
