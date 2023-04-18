package Singleton;
import java.lang.reflect.Method;
import java.lang.reflect.*;
class Check{
	private String name;
	Check(String name)
	{
		this.name=name;
	}
	private void private_method()
	{
		System.out.println("Private Method");
	}
	public void public_method()
	{
		System.out.println("Public method");
	}
}
class Reflection{
	public static void main(String[] args) throws Exception {
		Check c=new Check("Ram");
		// Knows class name
		Method m=Check.class.getDeclaredMethod("private_method");
		m.setAccessible(true);
		m.invoke(c);
		
		
		// Only knows class name 
		Method[] methods=Check.class.getDeclaredMethods();
		for(Method method:methods)
		{
			if(method.toString().startsWith("private"))
			{
				String s=method.toString();
				int a=s.lastIndexOf(".");
				int b=s.indexOf("(");
				s=s.substring(a+1,b);
				Method m1=Check.class.getDeclaredMethod(s);
				m1.setAccessible(true);
				m1.invoke(c);
			}
			
		}
		
		// Access private field of class
		Field f=Check.class.getDeclaredField("name");
		f.setAccessible(true);
		System.out.println(f.get(c));
		
		
	}
}