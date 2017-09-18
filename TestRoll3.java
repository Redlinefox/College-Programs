// TestRoll3.java
// Aric Akbani
// September 17, 2013
// This class creates a test of Roll3.

import java.util.Scanner;

public class TestRoll3
{
	public static void main(String []args)
	{
		
		// Testing default constructor
		Roll3 game = new Roll3();
		System.out.println("Lets play the dice game Roll 3\n");
		
		while(true)
      {
		   game.takeATurn();
			//game.getCurPlayer();
			System.out.println(game.curPlayer.getName() + " total score is " + game.curPlayer.getScore());
			System.out.println();
			if(game.gameOver())
			{
				System.out.print(game.curPlayer.getName() + " is the winner with a score of " + game.curPlayer.getScore());
				break;
			}
			game.nextPlayer();

		}
		
		
		// Testing constructor with parameters
		
		Scanner scan = new Scanner(System.in);
		
		
		Die dice[] = new Die[3];
		for(int i = 0; i < dice.length; i++)
		{
			dice[i] = new Die();
		}
		
		System.out.println("\nLets play the dice game2 Roll 3\n");

		System.out.println("How many players will play in this game? ");
		Player [] players = new Player[scan.nextInt()];
		scan.nextLine();
		
		for(int i = 0; i < players.length; i++)
		{
			players[i] = new Player();
			System.out.print("Player " + (i+1) + " name will be: ");
			players[i].setName(scan.nextLine());
		}
		
		System.out.println();
		System.out.print("What do you want your target score to be? ");
		int targetScore = scan.nextInt();
		System.out.println();
		
		Roll3 game2 = new Roll3(dice, players, targetScore);		
		
		while(true)
      {
		   game2.takeATurn();
			//game2.getCurPlayer();
			System.out.println(game2.curPlayer.getName() + " total score is " + game2.curPlayer.getScore());
			System.out.println();
			if(game2.gameOver())
			{
				System.out.print(game2.curPlayer.getName() + " is the winner with a score of " + game2.curPlayer.getScore());
				break;
			}
			game2.nextPlayer();

		}

		
	}
}