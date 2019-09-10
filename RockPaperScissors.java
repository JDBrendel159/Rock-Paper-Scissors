import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		initiate();
	}

    public static void initiate() {
	Scanner user = new Scanner (System.in);
		//for user input
		
	System.out.print("Enter player name: ");
	String name = user.nextLine();
	System.out.print("How many rounds would you like to play?: ");
	int maxRounds = user.nextInt();
        if (maxRounds % 2 == 0){
            maxRounds--;
            System.out.println("Even amount of rounds entered. Playing " + maxRounds + " rounds instead.");
        }
        if (maxRounds < 1) {
            maxRounds = 3;
            System.out.print("Round number cannot be below 1.  Playing 3 rounds instead.");
        }
	int pWinCount = 0;
        int cWinCount = 0;
	int round = 0;
	gameStart(name, maxRounds, pWinCount, cWinCount, round);
    }


	public static void gameStart(String name, int maxRounds, int pWinCount, int cWinCount, int round) {
		
		Scanner user = new Scanner (System.in);
		Random rand = new Random();
		
		do{
			String throwStr = "";
			System.out.println();
			System.out.print("Enter your throw (0=Rock, 1=Paper, 2=Scissors): ");
			int throwNum = user.nextInt();
			if (throwNum == 0) {
				throwStr = "ROCK";
			}else if (throwNum == 1) {
				throwStr = "PAPER";
			}else if (throwNum == 2) {
				throwStr = "SCISSORS";
			}else if (throwNum != 0 && throwNum != 1 && throwNum != 2) {
				System.out.println();
				System.out.println("Error: Please try again");
				System.out.println();
				gameStart(name, maxRounds, pWinCount, cWinCount, round);
				break;
			}
			System.out.println(name + " throws " + throwStr);
			int cpuThrow = rand.nextInt(3);
			if (cpuThrow == 0) {
				throwStr = "ROCK";
			}else if (cpuThrow == 1) {
				throwStr = "PAPER";
			}else if (cpuThrow == 2) {
				throwStr = "SCISSORS";
			}
			System.out.println("The Computer throws " + throwStr);
			if ((throwNum == 0 && cpuThrow == 2) || (throwNum == 1 && cpuThrow == 0) || (throwNum == 2 && cpuThrow == 1)) {
				System.out.println(name + " wins!");
				pWinCount++;
				round++;
			}else if (throwNum == cpuThrow) {
				System.out.println("Tie!");
			}else if ((throwNum == 2 && cpuThrow == 0) || (throwNum == 0 && cpuThrow == 1) || (throwNum == 1 && cpuThrow == 2)) {
				System.out.println("The Computer wins!");
				cWinCount++;
                		round++;
			}
            System.out.print("\n" + name + ": " + pWinCount + "\n");
            System.out.print("Computer: " + cWinCount + "\n\n");
		}while(cWinCount * 2 < maxRounds && pWinCount * 2 < maxRounds);
            if (pWinCount > cWinCount) {
                System.out.print("\n" + name + " is the winner!\n\n");
            }else{
                System.out.print("The Computer is the winner!\n\n");
            }
            initiate();

	}
}
