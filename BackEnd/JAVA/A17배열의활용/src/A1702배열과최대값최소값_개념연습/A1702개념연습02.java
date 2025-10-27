package A1702배열과최대값최소값_개념연습;
/*
[문제]
scoreList는 수학 점수입니다.
이 중에서 가장 높은 점수인 1등과 가장 낮은 점수인 꼴지를 제외한 점수들의 총점과 평균을 출력하시오.
단, 평균은 소수점 두 자리까지 반올림하여 출력합니다.
*/
/*
[출력예시]
90
10
176
58.67
*/
public class A1702개념연습02 {
	public static void main(String[] args) {
		  int[] scoreList = {10, 32, 65, 90, 89};
		    int max = scoreList[0];
		    int min = scoreList[0];
		    int total = 0;
		    for(int i = 1; i < scoreList.length; i++){
		        if(max < scoreList[i]){
		            max = scoreList[i];
		        }
		        if(min > scoreList[i]){
		            min = scoreList[i];
		        }
		        total += scoreList[i];
		    }
		    System.out.println(max);
		    System.out.println(min);
		    total -= max;
		    total -= min;
		    System.out.println(total);

		    int count = scoreList.length - 2;
		    double avg = (double)total / count;
		    System.out.println(String.format("%.2f", avg));
	}
}
