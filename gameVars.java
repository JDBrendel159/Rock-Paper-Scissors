import java.util.Random;

public class gameVars {
	
	String throwStr;
	int throwNum;

	public void makeThrow() {
		
		Random rand = new Random();
		throwNum = rand.nextInt(3);
		//generate the cpu's throw
		
		if (throwNum == 0) {
			throwStr = "ROCK";
		}else
		if (throwNum == 1) {
			throwStr = "PAPER";
		}else
		if (throwNum == 2) {
			throwStr = "SCISSORS";
		}
		//put cpu throw into a string
	}
	
	public String getThrowStr() {
		return throwStr;
		//grab the cpu's throw string
	}
	
	public int getThrowNum() {
		return throwNum;
		//grab the scpu's throw number
	}

}
