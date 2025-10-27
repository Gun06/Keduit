package A1308반복문거꾸로_개념연습;
/*
[문제]
반복문을 사용하여 15부터 1까지 숫자를 출력하되,
30의 약수이거나 20의 약수인 경우에는 숫자를 출력하고, 그 외에는 "x"를 출력하시오.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
15 x x x x 10 x x x 6 5 4 3 2 1
*/
public class A1308개념연습14 {
public static void main(String[] args) {
		int num = 15;
		for(int i = 1; i < 16; i++){
			boolean check = 30 % num == 0 || 20 % num == 0;
			if(check){
				System.out.print(num + " ");
			}
			if(!check){
				System.out.print("x ");
			}
			num -= 1;
		}
	}
}
