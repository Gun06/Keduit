package A1704배열과규칙찾기_개념연습;
/*
[문제]
numberList에서 짝수 인덱스에 해당하는 값을 거꾸로 출력하시오.
*/
/*
[출력예시]
60 12 21 
*/
public class A1704개념연습02 {
	public static void main(String[] args) {
		 int[] numberList =  {21, 44, 12, 54, 60};

		    int last = numberList.length - 1;
		    for(int i = 0; i < numberList.length; i++){
		        if(last % 2 == 0){
		        	System.out.print(numberList[last] + " ");
		        }
		        last -= 1;
		    }
	}
}
