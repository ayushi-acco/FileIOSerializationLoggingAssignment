package ayushi1;

import java.io.File;
import java.io.FilenameFilter;

public class file_assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("C:\\Users\\ayushi.jain\\Desktop\\MS TRAINING\\filewithtxtextensn");
		 
		FilenameFilter txtFileFilter = new FilenameFilter()
        {
            @Override
            public boolean accept(File dir, String name)
            {
                if(name.endsWith(".txt"))
               return true;
           
                else
            return false;
                
            }
        };
 
        //Passing txtFileFilter to listFiles() method to retrieve only txt files
 
        File[] files = folder.listFiles(txtFileFilter);
 
        for (File file : files)
        {
            System.out.println(file.getName());
            file.delete();
        }
        
	}

}
