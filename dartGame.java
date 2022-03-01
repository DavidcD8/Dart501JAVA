package dartGame;

public class dartGame {

	public static void main(String[] args) {
		// This object holds the name of players
		Player player1 = new Player ("David" ),	
				 player2 = new Player ("Johnny");
		boolean winner = false;
		boolean bustScore = false;
		 

		//This while loop will run until 1 player wins
		while(!winner  ) {
			for ( short darts = 0; darts <3; darts++) { 	 //This for loop will run 3 times for player 1
				winner = player1.throwDart();
				if (player1.bustScore == true) {
					break;}
				else if (winner == true) 
					break;
			}
			 if (!winner)
				for ( short darts = 0; darts <3; darts++) { //This for loop will run 3 times for player 2
					winner = player2.throwDart();
					if (player2.bustScore == true) 
						break;
					else if (winner == true)
						break;
				}

 
		}



	}


}

