/*			
 *			Author: David E.Cuevas Diaz
 * 			Date:	3/8/2021
 * 
 * 			This Program is a Game of darts with 501 score
 * 
 */

package dartGame;
import java.util.Scanner;


//This are the members of the class
public class Player {
	private String name;
	boolean winner = false;
	private  int playerScore =501;
	boolean bustScore = false;
	private int previousScore = playerScore;

//this constructor will get the names for players from the main Class.
	public Player(String playerName ) {
		this.name = playerName;


	}

// This method will prompt for the dart the players want to use and process it 
	public boolean throwDart ()  {

		// This will ask for the type of dart			
		Scanner sc = new Scanner(System.in);
		System.out.println (name + ", your score is now " + playerScore + "." );
		System.out.println(name + " Enter a Type: " + "\n" + "S: Single" + "\n" + "D: Double " + "\n" + "T: Treble "	+ "\n" + "B: BullsEye " + "\n" + "I: Inner Ring " + "\n" + "O: Off Board ");
		String dartType = sc.nextLine().toUpperCase();

		// this will Calculate a single dart
		if (dartType.equals("S")) {
			System.out.println(name + " Enter a Number 1 to 20");
			byte dart = sc.nextByte();
			playerScore -= dart;
			if (playerScore == 1) {
				bustScore = true;
				playerScore = previousScore;
				System.out.println("Score is Bust ");
			} else
				System.out.println(name + " Dart landed on " + dart + " your score is now " + playerScore + "\n");

		}
		// this will Calculate a Double
		if (dartType.equals("D")) {
			System.out.println(name + " Enter a Number 1 to 20");
			byte dartDouble = sc.nextByte();
			dartDouble *= 2;
			playerScore -= dartDouble;
			if (playerScore == 1) {
				playerScore = previousScore;
				System.out.println("Score is Bust ");
			} else if (playerScore == 0) {
				System.out.println(name + " Your Player Score is " + playerScore + " You win!");
				winner = true;
			} else
				System.out.println(
						name + " Dart landed on " + dartDouble + " your score is now " + playerScore + "\n");
		}
		// this will Calculate a Treble 
		if (dartType.equals("T")) {
			System.out.println(name + " Enter a Number 1 to 20");
			byte dartTreble = sc.nextByte();
			playerScore -= dartTreble;
			if (playerScore == 1) {
				bustScore = true;
				playerScore = previousScore;
				System.out.println("Score is Bust ");
			} else
				System.out.println(
						name + " Dart landed on " + dartTreble + " your score is now " + playerScore + "\n");
		}
		// this will Calculate a 50 points dart
		if (dartType.equals("B")) {
			previousScore =  playerScore;
			byte bullsEye = 50;
			playerScore -= bullsEye;
			if (playerScore == 1) {
				bustScore = true;
				playerScore = previousScore;
				System.out.println("Score is Bust ");
			} else if (playerScore == 0) {
				System.out.println(name + " Your Player Score is " + playerScore + " You win!");
				winner = true;
			} else
				System.out
				.println(name + " Dart landed on " + bullsEye + " your score is now " + playerScore + "\n");

		}
		// this will Calculate a 25 points dart
		if (dartType.equals("I")) {
			byte innerRing = 25;
			playerScore -= innerRing;
			if (playerScore == 1) {
				bustScore = true;
				playerScore = previousScore;
				System.out.println("Score is Bust ");
			} else
				System.out.println(
						name + " Dart landed on " + innerRing + " your score is now " + playerScore + "\n");

		}
		// this will Calculate a missed dart.
		if (dartType.equals("O")) {
			System.out.println(name + " Your Dart didn't hit the Board " + "\n");

		} 


		return winner;


	}

}
