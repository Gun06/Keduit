package A1501반복문키워드break_개념연습;
/*
[문제]
28의 배수 중 500 이상인 수들 중에서 가장 작은 수를 출력하시오.
단, break를 사용하시오.
*/ 
/*
[출력예시]
504
*/
public class A1501개념연습01 {
	public static void main(String[] args) {
		int num = 28;
	    int i = num;
	    while(true){
	        if(i >= 500){
	        	System.out.println(i);
	            break;
	        }
	        i += num;
	    }
	}
}
