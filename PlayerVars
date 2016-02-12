import java.util.*;

public class playerVars {

	int throwNum;
	String throwStr;
	String name;
	
	public void setName() {
		
		Scanner user = new Scanner (System.in);
		System.out.print("Enter the player's name: ");
		name = user.next();
		//set then player's name

	}
	
	public void makeThrow() {
		
		Scanner user = new Scanner (System.in);
		System.out.println();
		System.out.print("Enter your throw (0=Rock, 1=Paper, 2=Scissors): ");
		throwNum = user.nextInt();
		System.out.println();
		//get the players throw (from the player)
		
		if (throwNum == 0) {
			throwStr = "ROCK";
		}else
		if (throwNum == 1) {
			throwStr = "PAPER";
		}else
		if (throwNum == 2) {
			throwStr = "SCISSORS";
		}else
		if (throwNum != 0 && throwNum != 1 && throwNum != 2) {
			System.out.println();
			System.out.println("Error: Try Again");
			System.out.println();
			makeThrow();
			}
		//puts the throw into a string (or retries the throw if it's invalid)
		
	}
	
	public String getName() {
		return name;
		//get the player's name
	}
	
	public String getThrowStr() {
		return throwStr;
		//get the player's throw string
	}
	
	public int getThrowNum() {
		return throwNum;
		//get the player's throw number
	}

}
