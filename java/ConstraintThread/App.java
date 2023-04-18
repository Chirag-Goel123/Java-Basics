package ConstraintThread;
class App
{
	public static void main(String[] args) {
		Company c=new Company();
		Even e=new Even(c);
		Odd o=new Odd(c);
		e.setName("Thread A");
		o.setName("Thread B");
		e.start();
		o.start();
		try {
			o.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}