package A1308반복문거꾸로_개념연습;
/*
[문제]
for문을 사용하여 28부터 17까지 거꾸로 출력하시오.
*/
/*
[출력예시]
28 27 26 25 24 23 22 21 20 19 18 17 
*/
public class A1308개념연습06 {
public static void main(String[] args) {
		int num = 28;
	    for(int i = 17; i < 29; i++){
	    	System.out.print(num + " ");
	        num -= 1;
	    }
	}
}
