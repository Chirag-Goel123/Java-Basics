package Deadlock;

class Thread1 extends Thread
{
	Object res1;
	Object res2;
	public Thread1(Object res1,Object res2)
	{
		this.res1=res1;
		this.res2=res2;
	}
	
	public void run()
	{
		synchronized (res1) {
			System.out.println("Thread1:res1");
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread1: Acquiring lock on res2");
		synchronized (res2) {
			System.out.println("Thread1:Locked res2");
			
		}
	}
}