package ayushi1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

public class Exception_assignment12 {

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
		
		try {
			int ar[]=new int[6];
			System.out.println(ar[8]);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("catching Array index out of bound error");
		}
		try {
			File f=new File("C:\\Users\\ayushi.jain");
			FileReader fr=new FileReader(f);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("handel the file not found ecxption");
		}
		}

}
