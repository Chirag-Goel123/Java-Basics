package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Using Reflection creating 2 instance of Singleton Class
class DSingleton
{
	private static DSingleton obj;
	private DSingleton()
	{
		
	}
	public static DSingleton getInstance()
	{
		if(obj==null)
		{
			obj=new DSingleton();
		}
		return obj;
	}
}
class DestroySingleUsingReflection
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		DSingleton i1=DSingleton.getInstance();
		DSingleton i2=DSingleton.getInstance();
		System.out.println("Hash: "+i1.hashCode());
		System.out.println("Hash: "+i2.hashCode());
		Constructor[] constructor =DSingleton.class.getDeclaredConstructors();
		for(Constructor c:constructor)
		{
			System.out.println(c);
			c.setAccessible(true);
			i2=(DSingleton)c.newInstance();
			break;
		}
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}
}