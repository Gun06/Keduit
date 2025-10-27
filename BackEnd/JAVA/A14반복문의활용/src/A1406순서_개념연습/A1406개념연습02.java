package A1406순서_개념연습;
/*
[문제]
120의 두 번째 약수부터 세 개만 출력하시오.
*/
/*
[출력예시]
2 3 4 
*/
public class A1406개념연습02 {
	public static void main(String[] args) {
		 int num = 120;
		    int count = 0;
		    for(int i = 1; i < num + 1; i++){
		        if(num % i == 0){
		            count += 1;
		            if(2 <= count && count < 5){
		            	System.out.print(i + " ");
		            }
		        }
		    }
	}
}
