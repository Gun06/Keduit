package A1406순서_개념연습;
/*
[문제]
120의 거꾸로 두 번째 약수부터 세 개만 출력하시오.
*/
/*
[출력예시]
60 40 30 
*/
public class A1406개념연습03 {
	public static void main(String[] args) {
	    int num = 120;
	    int count = 0;
	    int j = num;
	    for(int i = 1; i < num + 1; i++){
	        if(num % j == 0){
	            count += 1;
	            if(2 <= count && count < 5){
	            	System.out.print(j + " ");
	            }
	        }
	        j -= 1;
	    }
	}
}
