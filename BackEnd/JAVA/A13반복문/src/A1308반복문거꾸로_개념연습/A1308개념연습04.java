package A1308반복문거꾸로_개념연습;
/*
[문제]
반복문을 사용하여 20부터 10까지 숫자를 출력하되,
15부터 12까지는 숫자와 그 숫자의 두배를 출력합니다.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
20 20
19 19
18 18
17 17
16 16
15 30
14 28
13 26
12 24
11 11
10 10
*/
public class A1308개념연습04 {
public static void main(String[] args) {
	 	int i = 20;
	    while(i >= 10){

	        boolean check = i >= 12 && i <= 15;

	        if(check){
	        	System.out.println(i + " " + i * 2);
	        }
	        if(!check){
	        	System.out.println(i + " " + i );
	        }
	       
	        i -= 1;
	    }
	}
}
