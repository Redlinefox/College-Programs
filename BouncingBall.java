//Bouncing Ball

public class BouncingBall
{
 	public static void main(String[]args)
	{
		//set scale of coordinate system
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		
		
		//position and radius of ball
		double rx = 0.5, ry = 0.5, r = 0.1;
		
		//velocity of ball
		double vx = 0.01, vy = 0.02;
		
		
		//animation loop
		while(true)
		{
			if (Math.abs(rx + vx) > 1.0 - r)
				vx = -(vx + 0.05);
				
			if (Math.abs(ry + vy) > 1.0 - r)
				vy = -(vy + 0.05);
				
			rx = rx + vx;
			ry = ry + vy;
			
			//clear background
			StdDraw.setPenColor(StdDraw.WHITE);
			StdDraw.filledSquare(0,0,1.0);
			
			//draw ball on screen
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(rx, ry, r);
			
			//display and pause for 20 ms
			StdDraw.show(20);
		}
		
	}
}