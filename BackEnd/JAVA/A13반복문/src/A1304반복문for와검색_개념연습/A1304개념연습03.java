package A1304반복문for와검색_개념연습;
/*
[문제]
반복문을 사용하여 1부터 10까지 숫자를 출력하되,
1부터 5까지는 숫자 뒤에 "o"를 출력하고,
6부터 10까지는 숫자 뒤에 "x"를 출력합니다.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
1 o
2 o
3 o
4 o
5 o
6 x
7 x
8 x
9 x
10 x
*/
public class A1304개념연습03 {
public static void main(String[] args) {
		for(int i = 1; i < 11; i++){
	        boolean check = 1 <= i && i <= 5;
	        if(check){
	        	System.out.println(i + " o");
	        }
	        if(!check){
	        	System.out.println(i + " x");
	        }
	    }
	}
}
