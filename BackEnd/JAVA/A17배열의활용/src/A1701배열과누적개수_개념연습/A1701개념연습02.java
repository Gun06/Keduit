package A1701배열과누적개수_개념연습;
/*
[문제]
numberList의 평균을 구한 후, 이 평균 값보다 큰 숫자의 개수를 구하고 출력하시오.
*/
/*
[출력예시]
150
30
2
*/
public class A1701개념연습02 {
	public static void main(String[] args) {
		 int[] numberList = {10, 20, 30, 40, 50};
		    int total = 0;
		    for(int i = 0; i < numberList.length; i++){
		        total += numberList[i];
		    }
		    double avg = (double)total / numberList.length;

		    int count = 0;
		    for(int i = 0; i < numberList.length; i++){
		        if(numberList[i] > avg){
		            count += 1;
		        }
		    }
		    System.out.println(total);
		    System.out.println(avg);
		    System.out.println(count);
	}
}
