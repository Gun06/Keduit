package A1501반복문키워드break_개념연습;
/*
[문제]
9의 배수 중 10의 자리가 6인 첫 번째 배수를 출력하시오.
단, break를 사용하시오.
*/
/*
[출력예시]
63
*/
public class A1501개념연습02 {
	public static void main(String[] args) {
		int num = 9;
	    int i = num;
	    while(true){
	    	int a = i % 100 / 10;
	        if(a == 6){
	        	System.out.println(i);
	            break;
	        }
	        i += num;
	    }
	}
}
