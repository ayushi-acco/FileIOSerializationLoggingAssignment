package ayushi1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exception_assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
