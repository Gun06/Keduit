package B0202클래스와데이터_개념연습;

/*
	[문제]
	    클래스로 변환하시오.
	[정답]
		4 * 6 = 24
		3 * 6 = 18
		8 * 3 = 24
		9 * 9 = 81
		2 * 3 = 6
		6 * 7 = 42
*/

class Game{
    int a;
    int b;
    int c;
}
public class B0202개념연습01 {
	public static void main(String[] args) {
		
		int[][] arr = {
			{4, 6},
			{3, 6},
			{8, 3},
			{9, 9},
			{2, 3},
			{6, 7},
		};
		
		Game[] gameList = new Game[arr.length];
		for(int i = 0; i < arr.length; i++) {
			Game g = new Game();
			g.a = arr[i][0];
			g.b = arr[i][1];
			g.c = g.a * g.b;
			gameList[i] = g;
		}
		
		for(int i = 0; i < gameList.length; i++) {
			System.out.println(gameList[i].a + " * " + gameList[i].b + " = " + gameList[i].c);
		}
		
	}
}







