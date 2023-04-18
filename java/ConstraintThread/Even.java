package ConstraintThread;
class Even extends Thread
{
	Company c;
	Even(Company c)
	{
		this.c=c;
	}
	public void run()
	{
		for(int i=25;i<50;i++)
		{
			c.print(i);
		}
	}
}