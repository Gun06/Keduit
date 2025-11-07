package A1304반복문for와검색_문제;
/*
[문제]
반복문을 사용하여 1부터 10까지의 숫자 중,
숫자가 3보다 작거나 8보다 크면 "x"를 출력하고,
그렇지 않을 경우에는 숫자를 그대로 출력합니다.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
x x 3 4 5 6 7 8 x x 
*/
public class A1304문제02 {
public static void main(String[] args) {
		for(int i = 1; i < 10; i ++) {
			boolean check = 8 < i || i < 3;
	        if(check){
	        	System.out.print("x ");
	        }
	        if(!check){
	        	System.out.print(i + " ");
	        }
		}
	}
}
