package A1402반복문과개수_개념연습;
/*
[문제]
반복문을 사용하여 100부터 300까지의 숫자 중에서,
9의 배수이면서 홀수인 숫자를 모두 출력한 후,  
그 개수도 출력하시오.
*/
/*
[출력예시]
108 126 144 162 180 198 216 234 252 270 288 
11 
*/
public class A1402개념연습05 {
	public static void main(String[] args) {
		int count = 0;
	    for(int i = 100; i < 301; i++){
	        boolean check1 = i % 9 == 0;
	        boolean check2 = i % 2 == 0;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
