package A1701배열과누적개수_개념연습;
/*
[문제]
numberList의 짝수의 합을 구하시오.
*/ 
/*
[출력예시]
72
*/
public class A1701개념연습04 {
	public static void main(String[] args) {
		 int[] numberList = {14, 13, 36, 41, 22};
		    int total = 0;
		    for(int i = 0 ; i < numberList.length; i++){
		        if(numberList[i] % 2 == 0){
		            total += numberList[i];
		        }
		    }
		    System.out.println(total);
	}
}
