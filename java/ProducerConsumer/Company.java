package ProducerConsumer;

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
		System.out.println("produced "+this.n);
		flag=true;
		notify();
	}
	public synchronized int consume_items() throws Exception
	{
		if(flag==false)
		{
			wait();
		}
		System.out.println("consumed "+this.n);
		flag=false;
		notify();
		return this.n; 
	}
}