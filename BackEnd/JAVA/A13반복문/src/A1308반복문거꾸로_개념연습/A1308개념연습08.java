package A1308반복문거꾸로_개념연습;
/*
[문제]
반복문을 사용하여 20부터 10까지 숫자를 출력하되,
20부터 10까지는 숫자 뒤에 "o"를 출력하고,
14부터 10까지는 숫자 뒤에 "x"를 출력합니다.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
20 o
19 o
18 o
17 o
16 o
15 o
14 x
13 x
12 x
11 x
10 x  
*/
public class A1308개념연습08 {
public static void main(String[] args) {
		int num = 20;
	    for(int i = 10; i < 21; i++){
	        boolean check1 = num >= 15 && num <= 20;
	        boolean check2 = num >= 10 && num <= 14;
	        if(check1){
	        	System.out.println(num + " o");
	        }
	        if(check2){
	        	System.out.println(num + " x");
	        }
	        num -= 1;
	    }
    
	}
}
