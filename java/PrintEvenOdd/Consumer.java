package PrintEvenOdd;

class Consumer extends Thread
{
	Company c1;
	Consumer(Company c1)
	{
		this.c1=c1;
	}
	
	public void run()
	{
		int i=1;
		while(true)
		{
			try {
				this.c1.consume_items(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i+=2;
		}
	}
}