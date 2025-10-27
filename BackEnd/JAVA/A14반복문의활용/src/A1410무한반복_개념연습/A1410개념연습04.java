package A1410무한반복_개념연습;
/*
[문제]
9의 배수 중 100보다 큰 네 번째 배수를 출력하시오.
*/
/*
[출력예시]
135
*/
public class A1410개념연습04 {
	public static void main(String[] args) {

	    int num1 = 9;
	    int num2 = 100;
	    int i = num1;
	    int count = 0;
	    boolean loop = true;
	    while(loop){
	        if(i > num2){
	            count += 1;
	            if(count == 4){
	            	System.out.println(i);
	                loop = false;
	            }
	        }
	        i += num1;
	    }
	}
}
