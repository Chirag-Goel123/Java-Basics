//how to create custom exception...


class AgeInvalidException extends Exception
{

	AgeInvalidException()
	{
		super("Age is invalid !");
	}

	AgeInvalidException(String message)
	{
		super(message);
	}

}




class Example
{
	public static void main(String[] args) {
		System.out.println("Started...");//starting ...


		try
		{
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			System.out.println("We have got two numbers..");
			int result=n1/n2;
			System.out.println("Division is "+result);

			if(n2<10)
			{
				throw new AgeInvalidException("My age is invalid !!");
			}

		}
		catch(ArithmeticException e)
		{
			System.out.println("n2 can not be 0 !!");
			System.out.println(e.getMessage());	
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid Numbers !!");
			System.out.println(e.getMessage());	
		}
		catch (AgeInvalidException e) {
			System.out.println("Invalid N2");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error !!");
			System.out.println(e.getMessage());
		}
		finally
		{
			//always gets executed ..
			System.out.println("i am in finally block");
			System.out.println("closing all the resources...");
		}

		//100

		System.out.println("Terminated..");//ending point
	}
}



// import java.lang.*;
// class AgeInvalidException extends Exception
// {
//     AgeInvalidException()
//     {
//         super("Age invalid");
//     }
//     AgeInvalidException(String message)
//     {
//         super(message);
//     }
// }
// public class Exception {
//     public static void main(String[] args) {
//         System.out.println("Started");
//         try{
//             int n1=Integer.parseInt(args[0]);
//             int n2=Integer.parseInt(args[1]);
//             if(n2<10)
//             {
//                 throw new AgeInvalidException("Age is invalid");
//             }
//             System.out.println(n1/n2);
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e.getMessage());
//         }
//         catch(NumberFormatException e)
//         {
//             System.out.println(e.getMessage());
//         }
//         catch(java.lang.Exception e)
//         {
//             System.out.println("Error!!");
//             System.out.println(e.getMessage());
//         }
//         finally
//         {
//             System.out.println("I am in finally");
//         }
//         System.out.println("terminated");
//     }
// }
