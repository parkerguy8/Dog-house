package doghousepackage;

public class Dog
{
   // declare and initialize private member variables here	
   private int numTimesFed = 0;
   private boolean sleeping = false;
   private String name = "Doug";

   public String getName()
   {
	return name;
   }

   public void wakeUp()
   {
	   System.out.println("WAKING UP");
	   boolean sleeping = false;
	   int numTimesFed = 0;
	   System.out.println("Doug.exe starting up");
   }

   public void sleep()
   {
	   boolean sleeping = true;
	   System.out.println("SLEEPING");
	   System.out.println("Snore");
   }

   public void hear(String sound)
   {
	   System.out.println("BARK BARK");
   }

   public void feed()
   {
	   numTimesFed = numTimesFed + 1;
	   if(numTimesFed > 3)
	   		{
	   			 System.out.println("burp");
	   		}
	   else
		   System.out.println("must consume more L00ps");
   }
}