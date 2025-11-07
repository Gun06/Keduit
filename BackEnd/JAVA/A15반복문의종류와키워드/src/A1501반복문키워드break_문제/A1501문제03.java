package A1501반복문키워드break_문제;
/*
[문제]
13의 배수 중 여섯 번째 배수에서 네 번째 배수를 뺀 값을 출력하시오.
단, break를 사용하시오.
*/
/*
[출력예시]
26
*/
public class A1501문제03 {
	public static void main(String[] args) {
int num = 13;
	    int count = 0;
	    int a = 0;
	    int b = 0;
	    int i = num;

	    while(true){
	        count += 1;
	        if(count == 4){
	            a = i;
	        }
	        if(count == 6){
	            b = i;
	            break;
	        }
	        i += num;
	    }
	    System.out.println(b - a);
	}
}
