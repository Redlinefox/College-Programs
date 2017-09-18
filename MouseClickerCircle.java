//Mouse Clicker Circle

public class MouseClickerCircle
{
	public static void main(String []args)
	{
 		double x = 0.5, y = 0.5;
		double radius = 0.1;
		
		StdDraw.circle(x, y, radius);
	
		while(true)
		{
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.clear();
   		StdDraw.circle(x, y, radius);
			
			if(StdDraw.mousePressed())
			{
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.filledCircle(0.5, 0.5, 0.3);
				StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledCircle(0.5, 0.5, 0.1);
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.circle(0.5, 0.5, 0.2);
				
			}
			
			double d1= StdDraw.mouseX();
			double e1 = StdDraw.mouseY();

			
			StdDraw.setPenRadius();
        	StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        	double[] d = { d1+.05, d1, d1-.05, d1};
        	double[] e = { e1, e1+.05, e1, e1-.05};
        	StdDraw.filledPolygon(d, e);

			
			StdDraw.show(20);
		}
	
	}
}