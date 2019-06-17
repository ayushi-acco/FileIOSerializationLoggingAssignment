package ayushi1;
import java.io.*;
public class file_assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("F:/Path");
		 
        String[] files = folder.list();
 
        for (String file : files)
        {
            System.out.println(file);
        }
	}

}
