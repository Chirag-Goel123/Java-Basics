package Deadlock;

class App{
	public static void main(String[] args) {
		Object res1=new Object();
		Object res2=new Object();
		Thread1 t1=new Thread1(res1, res2);
		
		Thread2 t2=new Thread2(res1, res2);
		t1.start();
		t2.start();
	}
}