/* DiceGame.java
*  Joy McQuillan
*  Sept. 10, 2013
* 
*  DiceGame.java is an abstract class that declares some instance data which is 
*  common to many dice games.  Also, the common methods are defined, but the bodies 
*  are not written.
*/

public abstract class DiceGame
{
   // instance data common to many dice games
   protected Die[] dice;
   protected Player[] players;
   protected Player curPlayer;
   protected int curPlayerIndex;
   
   // since it is not possible to create an instance of an abstract class,
   // we do not need a constructor
   
   // accessors
   public Die[] getDice()
   {
      return dice;
   }
   public Player[] getPlayers()
   {
      return players;
   }
   public Player getCurPlayer()
   {
      return curPlayer;
   }
   
   // mutators
   // in case the array of Player objects is created outside of the constructor
	// current player is set to the first player in the array
   public void setPlayers(Player[] plays)
   {
      players = plays;
		curPlayer = players[0];
		curPlayerIndex = 0;
   }
   
   // in case the array of Die objects is created outside of the constructor
   public void setDice(Die[] d)
   {
      dice = d;
   }
   
   // sets the current player to p AND updates the curPlayerIndex
   public void setCurPlayer(Player p)
   {
		// find the index for Player p
		int tempIndex = -1;
		for(int i=0; i<players.length && tempIndex==-1; i++)
		{
			if (players[i] == p)
				tempIndex = i;
		}
		if (tempIndex == -1)
			System.out.println("Invalid player, current player remains as before.");
		else
		{
			curPlayer = p;
			curPlayerIndex = tempIndex;
		}
   }
   
	// verifies curPlayer index
	public void setCurPlayerIndex(int index) 
	{
		if( index < 0 || index > players.length)
		{
			return;
		}
		
		else		
		{
			curPlayerIndex = index;
		}
	}
		
   // method to roll all dice in the array
   public void rollAll()
   {
      for(int i=0; i<dice.length; i++)
         dice[i].roll();
   }
   
   // method to determine if any of the players has won AND if all
	// players are finished
   public abstract boolean gameOver();
	
	// method to determine if there is a winner
	public boolean isWinner()
   {
      boolean win = false;
      for(int i=0; i<players.length && !win; i++)
      {
         if(players[i].isWinner())
            win = true;
      }
      return win;
   }
   
   // method to return a String representation of all dice rolled, all on one line, separated by spaces
   public String diceToString()
   {
      String retValue = "";
      for(int i=0; i<dice.length; i++)
         retValue += dice[i].getFace() + "  ";
      return retValue;
   }
   
   // method to advance the curPlayer variable to the next player
   public void nextPlayer()
   {
      if(curPlayerIndex == players.length-1)
         curPlayerIndex = 0;
      else
         curPlayerIndex++;
      curPlayer = players[curPlayerIndex];
   }
   
   // method to implement a turn for the current player
   public abstract void takeATurn();
   
   // method to calculate the score for the current player's turn
   // this method does NOT alter the value stored in the Player object's score variable
   public abstract int determineScore(int temp);   
}   