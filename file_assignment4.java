package ayushi1;

import java.io.File;

public class file_assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ayushi.jain\\Desktop\\MS TRAINING\\filewithtxtextensn\\file3.txt"); 
        
        // renaming the file and moving it to a new location 
        if(file.renameTo 
           (new File("C:\\Users\\ayushi.jain\\Desktop\\MS TRAINING_dest\\newFile3.txt"))) 
        { 
            // if file copied successfully then delete the original file 
            file.delete(); 
            System.out.println("File moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
	}

}
