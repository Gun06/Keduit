package A1304반복문for와검색_개념연습;
/*
[문제]
반복문을 사용하여 1부터 10까지의 숫자 중,
숫자가 4보다 크고 8보다 작으면 "x"를 출력하고,
그렇지 않을 경우에는 숫자를 그대로 출력합니다.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
1 2 3 4 x x x 8 9 10
*/
public class A1304개념연습01 {
public static void main(String[] args) {
		for(int i = 1; i < 11; i++){
	        boolean check = 4 < i && i < 8;
	        if(check){
	        	System.out.print("x ");
	        }
	        if(!check){
	        	System.out.print(i + " ");
	        }
	    }
	}
}
