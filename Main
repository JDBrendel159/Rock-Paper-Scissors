import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Scanner user = new Scanner (System.in);
		gameVars cpu = new gameVars();
		playerVars player = new playerVars();
		player.setName();
		System.out.print("How many rounds would you like to play?: ");
		double roundMax = user.nextInt();
		int round = 1;
		double winCount = 0;
		//initialize some variables and create the player and cpu
		
		do {
			player.makeThrow();
			cpu.makeThrow();
			//make the throws
			System.out.println(player.getName() + " throws " + player.getThrowStr());
			System.out.println("The Computer throws " + cpu.getThrowStr());
			//print out throws
			if ((player.getThrowNum() == 0 && cpu.getThrowNum() == 2) || (player.getThrowNum() == 1 && cpu.getThrowNum() == 0) || (player.getThrowNum() == 2 && cpu.getThrowNum() == 1)) {
				System.out.println(player.getName() + " wins!");
				winCount++;
				round++;
			}else
			if (player.getThrowNum() == cpu.getThrowNum()) {
				System.out.println("Tie!");
			}else
			if ((player.getThrowNum() == 2 && cpu.getThrowNum() == 0) || (player.getThrowNum() == 0 && cpu.getThrowNum() == 1) || (player.getThrowNum() == 1 && cpu.getThrowNum() == 2)) {
				System.out.println("The Computer wins!");
				round++;
			}
			//compare the throws and output accordingly
		}while(round <= roundMax);
		
		if (winCount == roundMax/2) {
			System.out.println();
			System.out.println("It's a tie!");
			}else
		if (winCount > roundMax/2) {
			System.out.println();
			System.out.println(player.getName() + " is the winner!");
			}else
			if (winCount < roundMax/2) {
			System.out.println();
			System.out.println("The Computer is the winner!");
			}
			//print out who won
	}
}
