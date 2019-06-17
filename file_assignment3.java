package ayushi1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
			FileReader fr = new FileReader("C:\\Users\\ayushi.jain\\Desktop\\MS TRAINING\\filewithtxtextensn\\file1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:\\Users\\ayushi.jain\\Desktop\\MS TRAINING\\filewithtxtextensn\\file2.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) { // read a line
				fw.write(s); // write to output file
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("file copied");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
