package A1402반복문과개수_개념연습;
/*
[문제]
반복문을 사용하여 100부터 150까지의 숫자 중에서,
8의 배수인 숫자의 개수를 출력하시오.
 */
 /*
[출력예시]
104 112 120 128 136 144 
6
 */
public class A1402개념연습04 {
	public static void main(String[] args) {
		int count = 0;
	    for(int i = 100; i < 151; i++){
	        if(i % 8 == 0){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);

	}
}
