package Singleton;
class Singleton{
	private static Singleton obj=null;
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if(obj==null)
		{
			obj=new Singleton();
		}
		return obj;
	}
}
public class App{
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}