package A1308반복문거꾸로_개념연습;
/*
[문제]
반복문을 사용하여 12부터 5까지 거꾸로 출력하시오.
*/
/*
[출력예시]
12 11 10 9 8 7 6 5 
*/
public class A1308개념연습01 {
public static void main(String[] args) {
		int i = 5;
	    int num = 12;
	    while(i <= 12){
	    	System.out.print(num + " ");
	        i += 1;
	        num -= 1;
	
	    }
	}
}
