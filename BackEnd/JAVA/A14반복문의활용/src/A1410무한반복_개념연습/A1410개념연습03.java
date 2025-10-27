package A1410무한반복_개념연습;
/*
[문제]
13의 배수 중 여섯 번째 배수에서 네 번째 배수를 뺀 값을 출력하시오.
*/
/*
[출력예시]
26
*/
public class A1410개념연습03 {
	public static void main(String[] args) {
		int num = 13;
	    int count = 0;
	    int a = 0;
	    int b = 0;
	    int i = num;
	    boolean loop = true;
	    while(loop){
	        count += 1;
	        if(count == 4){
	            a = i;
	        }
	        if(count == 6){
	            b = i;
	            loop = false;
	        }
	        i += num;
	    }
	    System.out.println(b - a);
	}
}
