package PrintEvenOdd;

class Company 
{
	int n;
	boolean flag=false;
	public synchronized void produce_items(int n) throws Exception
	{
		if(flag)
		{
			wait();
		}
		this.n=n;
		System.out.println("Even "+this.n);
		flag=true;
		notify();
	}
	public synchronized void consume_items(int n) throws Exception
	{
		if(flag==false)
		{
			wait();
		}
		this.n=n;
		System.out.println("Odd "+this.n);
		flag=false;
		notify();
	}
}