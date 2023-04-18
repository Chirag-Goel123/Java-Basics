package ConstraintThread;
class Company
{
	public void print(int val)
	{
		System.out.println(Thread.currentThread().getName()+" : "+val);
	}
	
}