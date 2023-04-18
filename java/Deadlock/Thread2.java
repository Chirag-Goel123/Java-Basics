package Deadlock;

class Thread2 extends Thread
{
	Object res1;
	Object res2;
	public Thread2(Object res1,Object res2)
	{
		this.res1=res1;
		this.res2=res2;
	}
	public void run()
	{
		synchronized (res1) {
			System.out.println("Thread2: Res2");
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread2: Acquiring lock on res2");
		synchronized (res2) {
			System.out.println("Thread2: Locked on res1");
		}
	}
}