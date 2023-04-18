package YTubeEvenOddExample;
class Printer implements Runnable{
	static int count=1;
	static Object lock=new Object();
	int rem;
	Printer(int rem)
	{
		this.rem=rem;
	}
	public void print()
	{
		System.out.println(Thread.currentThread().getName()+" "+count);
		count++;
	}
	public void run()
	{
		while(count<10)
		{
			synchronized (lock) {
				while(count%2!=rem)
				{
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				print();
				lock.notify();
			}
		}
	}
}
 class App
 {
	 public static void main(String[] args) {
		Printer even=new Printer(0);
		Printer odd=new Printer(1);
		
		Thread t1=new Thread(even,"Even Thread");
		Thread t2=new Thread(odd,"Odd Thread");
		
		t1.start();
		t2.start();
	}
 }