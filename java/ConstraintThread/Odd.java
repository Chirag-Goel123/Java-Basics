package ConstraintThread;
class Odd extends Thread
{
	Company c;
	Odd(Company c)
	{
		this.c=c;
	}
	public void run()
	{
		for(int i=0;i<25;i++)
		{
			c.print(i);
		}
	}
}