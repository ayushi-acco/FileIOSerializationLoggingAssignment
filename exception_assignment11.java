package ayushi1;

public class exception_assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b;
			b=a/0;
			
		}
			catch(ArithmeticException e)
			{
				System.out.println("catching divide by zero error");
			}

	}

}
