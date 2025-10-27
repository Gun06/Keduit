package B0101이차배열;

import java.util.Arrays;
import java.util.Random;
/*
[이차리스트 중에서 랜덤으로 한줄을 출력 ]
*/

/*
0
[10, 54]

*/
public class B0101개념06_랜덤출력 {
	public static void main(String[] args) {
	

	    int[][] numberLists = {{10, 54},{43, 6},{23, 4}};
	    
	    Random ran= new Random();
	    int index = ran.nextInt(numberLists.length);
	    System.out.println(index);
	    System.out.println(Arrays.toString(numberLists[index]));
	}
}
