import java.util.Random;

public class Die
{
   protected int face;
   
   public Die()
   {
      Random rand = new Random();
      
      face = rand.nextInt(6) + 1;
   }
   
   public Die(int g)
   {
      face = g;
   }
   
   public void roll()
   {
      Random rand = new Random();
      
      face = rand.nextInt(6) + 1;
   }
   
   public int getFace()
   {
      return face;
   }
   
   public void setFace(int g )
   {
  		if(g < 1 || g > 6)
		{
			return;
		}		
		
		else    
		this.face = g;
		
   }
   
   public String toString()
   {
      return "Face of die: " + face;
   }

}