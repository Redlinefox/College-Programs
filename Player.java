// Player.java
// Aric Akbani
// September 9, 2013
// This class creates all the methods for the Player class.

public class Player extends Person
{
	// create instance variables for score, winner and finished
	protected int score; 
	protected boolean winner;
	protected boolean finished;
	
	// default constructor with no parameters
	public Player()
	{	
		name = "";
		age = -1;
		score = 0;
		winner = false;
		finished = false;
	}
	
	// constructor which brings values in for name and age
	public Player(String nameIn, int ageIn)
	{
		name = nameIn;
		age = ageIn;
		score = 0;
		winner = false;
		finished = false;
	}
	
	// constructor which brings values in for name, age and score
	public Player(String nameIn, int ageIn, int scoreIn)
	{
		name = nameIn;
		age = ageIn;
		score = scoreIn;
		winner = false;
		finished = false;
	}
	
	// create accessor methods for score, winner and finished
	public int getScore()
	{
		return score;
	}
	
	public boolean isWinner()
	{
		return winner;
	}
	
	public boolean isFinished()
	{
		return finished;
	}
	
	// create mutator methods for score, winner and finished
	public void setScore(int sScore)
	{
		if(sScore < 0)
		{
			return;
		}		
		
		else
			score = sScore;
	}
	
	public void setWinner(boolean sWinner)
	{
		winner = sWinner;
	}

	public void setFinished(boolean sFinished)
	{
		finished = sFinished;
	}

	// create toString to overide the Object class toString method
	public String toString()
	{
		return "Name: " + name + "\nAge: " + age + "\nScore: " + score + "\nWinner: " + winner + "\nFinished: " + finished;
	}

}