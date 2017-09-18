// Roll3.java
// Aric Akbani
// September 16, 2013
// This class creates a rolling dice game using 3 die.

import java.util.Scanner;

public class Roll3 extends DiceGame
{
	//integer to record the target score to determine winner
   protected int targetScore;
   
   // default constructors to initialize variables to following values 
   public Roll3()
	{	
		dice = new Die[3];  
		dice[0] = new Die(0);
  		dice[1] = new Die(0);
   	dice[2] = new Die(0);
      
   	players = new Player[2];
   	players[0] = new Player("Player 1", -1, 0);
   	players[1] = new Player("Player 2", -1, 0);
      
   	curPlayer = players[0];
		curPlayerIndex = 0;
		targetScore = 50;
		
	}
	
	// constructor with 3 parameters
	public Roll3(Die[] diceIn, Player[] playersIn, int targetIn)
	{
		dice = diceIn;
		players = playersIn;
		curPlayer = players[0];
		curPlayerIndex = 0;	
		targetScore = targetIn;
	}
	
	
	
	public int getTargetScore()
	{	
		return targetScore;
	}
	
	public void setTargetScore(int sTargetScore)
	{
		if(sTargetScore < 0)
		{
			return;
		}
		
		else
			targetScore = sTargetScore;
	}
	
	public String toString()
	{
		return ("Name: " + players[0].name + " Score: " + players[0].score + 
		"\n" + "Name: " + players[1].name + " Score: " + players[1].score);
	}
	
	private int sumOfDice()
	{
		int sum = 0;
		
		for(int i = 0; i < dice.length; i++)
		{
			sum = dice[i].getFace() + sum;
		}

		return sum;
	}
	
	private boolean ifOne()
	{
		for(int i = 0; i < dice.length; i++)
		{
			if( dice[i].getFace() == 1)
			{
				return true;
			}
		} 
		
		return false;
		
	}
	
	public int determineScore(int temp)
	{
		int totalScore = players[curPlayerIndex].score + temp;		
		return totalScore;
	}
	
	public void takeATurn()
	{
		Scanner scan = new Scanner(System.in);
		
		String rollAgain = "Y";
		boolean endT = false;
		int tempScore = 0;
		int tempScorePlusTotal = 0;
		
		while( rollAgain.equalsIgnoreCase("Y") && endT == false)
		{
			getCurPlayer();
			System.out.print(curPlayer.getName() + " takes a turn to roll the dice.\n");
			// current player rolls 3 die
			//System.out.print(players[curPlayerIndex].getName() + " rolls 3 dice.");
			rollAll();
			System.out.print("The dice are: " + diceToString());
			
			// determine if there is a 1 in any of the die, if 1 temporary score = 0 and end turn
			if( ifOne()== true)
				{
					endT = true;
					System.out.println("\nRolled a 1 so end turn");
				}
						
			// if there is no 1 then  tempScore = tempScore + sumOfDice
			if( endT != true)
				tempScore = tempScore + sumOfDice();
			
			// check if tempScore + player.score is eligible for gameOver, if so endT = true	
			tempScorePlusTotal = tempScore + curPlayer.getScore();	
			if( gameOver() == true)
				endT = true;
				
			// if endT != true ask if the player wants to roll again, if so then continue
			if( endT != true)
			{
				System.out.print("Would you like to take a risk and roll again? (Y/N) ");
				rollAgain = scan.nextLine();
				
				if( rollAgain.equalsIgnoreCase("N"))
				{
					curPlayer.setScore(curPlayer.getScore() + tempScore);
					endT = true;
					
				}
			}				
		}		
			
	}
	
	public boolean gameOver()
	{
		if( players[curPlayerIndex].getScore() >= targetScore)
			return true;
		
		else
			return false;
	}
}