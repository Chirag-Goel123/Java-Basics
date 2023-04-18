package ConceptualQues;
import java.util.*;
class A
{
	private static final Set<Class<? extends A>> instance=new HashSet<>(); 
	public A()
	{
		System.out.println("OK");
		synchronized (instance) {
			if(instance.contains(getClass()))
			{
				throw new RuntimeException("duplication"+getClass().getSimpleName());
			}
			instance.add(getClass());
		}
	}
}
class App extends A
{
	App()
	{
		System.out.println("B");
	}
	public static void main(String[] args) {
		new A();
	//	new A();
		new App();
		new App();
	}
}