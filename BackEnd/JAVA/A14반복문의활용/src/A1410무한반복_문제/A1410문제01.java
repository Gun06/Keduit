package A1410무한반복_문제;
/*
[문제]
28의 배수 중 500 이상인 수들 중에서 가장 작은 수를 출력하시오.
*/
/*
[출력예시]
504
*/
public class A1410문제01 {
	public static void main(String[] args) {
int num = 28;
	    int count = 0;
	    int i = num;
	    boolean loop = true;
	    while(loop){
	        if(i >= 500){
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
