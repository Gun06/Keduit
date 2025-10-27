package A1410무한반복_개념연습;
/*
[문제]
9의 배수 중 10의 자리가 6인 첫 번째 배수를 출력하시오.
*/
/*
[출력예시]
63
*/
public class A1410개념연습02 {
	public static void main(String[] args) {
		int num = 9;
	    int count = 0;
	    int i = num;
	    boolean loop = true;
	    while(loop){
	        int a = i % 100 / 10;
	        if(a == 6){
	            count += 1;
	            if(count == 1){
	            	System.out.println(i);
	                loop = false;
	            }
	        }
	        i += num;
	    }
	}
}
