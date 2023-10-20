
public class Exception7 {
   public static void main(String args[ ]) 
	{
		try 
		{
			int a = 0;
			int b = 10 / a;
		} 
		catch(Exception e) 
		{
		     System.out.println("Generic Exception catch."+e);
		}
//		catch(ArithmeticException e) 
//		{ 	//   ERROR – unreachable code
//			System.out.println("ArithmeticException"+e);
//		}
	}


}
