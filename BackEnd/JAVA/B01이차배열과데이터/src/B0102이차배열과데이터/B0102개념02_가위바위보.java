package B0102이차배열과데이터;

import java.util.Arrays;
/*
[문제]
a가이기면 pos + 3 , 비기면 pos + 1 , 지면 pos -1
*/ 
/* 
[출력예시]
50
49
50
53
52
*/
public class B0102개념02_가위바위보 {
	public static void main(String[] args) {
		String[][] game = {
				{"가위" , "바위"},
				{"바위" , "바위"},
				{"가위" , "보"},
	            {"보" , "가위"},
            };

		        
		       int pos = 50;
		       System.out.println(pos);
		        for(int i = 0; i < game.length; i++){
		            if(game[i][0] == game[i][1]){
		            	pos += 1;
		            }else if(game[i][0] == "가위" && game[i][1] == "보"){
		            	pos += 3;
		            }else if(game[i][0] == "바위" && game[i][1] == "가위"){
		            	pos += 3;
		            }else if(game[i][0] == "보" && game[i][1] == "바위"){
		            	pos += 3;
		            }else{
		            	pos -= 1;
		            }
		            System.out.println(pos);
		        }

	}
}
