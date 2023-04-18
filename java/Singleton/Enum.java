package Singleton;


enum SingletonEnum
{
	Instance;
	int value;
	public int getValue()
	{
		return value;
	}
	public void setValue(int value)
	{
		this.value=value;
	}
	
}
class Enum
{
	public static void main(String[] args) {
		SingletonEnum e1=SingletonEnum.Instance;
		SingletonEnum e2=SingletonEnum.Instance;
		
		e1.setValue(89);
		System.out.println(e2.getValue());
		
	}
}