
package Singleton;

// Normal Singleton-> Lazy Form
class NSingleton{
	private static NSingleton obj=null;
	private NSingleton()
	{
		
	}
	public static NSingleton getInstance()
	{
		if(obj==null)
		{
			obj=new NSingleton();
		}
		return obj;
	}
}

// Early Form Singleton
class ESingleton{
	private static ESingleton obj=new ESingleton();
	private ESingleton()
	{
		
	}
	public static ESingleton getInstance()
	{
		return obj;
	}
}

// Thread Safe
class TSingleton{
	private static TSingleton obj=null;
	private TSingleton()
	{
		
	}
	public static synchronized TSingleton getInstance()
	{
		if(obj==null)
		{
			obj=new TSingleton();
		}
		return obj;
	}
}

// Thread Safe with Better Performance: Synchronized Block-> Synchronized(Singleton.class){}

class Singleton1{
	private static Singleton1 obj;
	private Singleton1()
	{
		
	}
	public static Singleton1 getInstance()
	{
		if(obj==null)
		{
			synchronized (Singleton1.class) {
				if(obj==null)
				{
					obj=new Singleton1();
				}
			}
		}
		return obj;
	}
}
