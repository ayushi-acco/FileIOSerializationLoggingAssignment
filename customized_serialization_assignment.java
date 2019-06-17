package ayushi1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable { 
	  
    String username = "admin"; 
  
    transient String pwd = "aayu"; 
    private void writeObject(ObjectOutputStream oos) throws Exception 
    { 
        // to perform default serialization of Account object. 
        //oos.defaultWriteObject(); 
  
        // epwd (encrypted password) 
        String epwd = "123" + pwd; 
  
        // writing encrypted password to the file 
        oos.writeObject(epwd); 
    } 
  
    // this method is executed by jvm when readObject() on 
    // Account object reference in main method is executed by jvm. 
    private void readObject(ObjectInputStream ois) throws Exception 
    { 
        // performing default deserialization of Account object 
        //ois.defaultReadObject(); 
  
        // deserializing the encrypted password from the file 
        String epwd = (String)ois.readObject(); 
  
        // decrypting it and saving it to the original password 
        // string starting from 3rd  index till the last index 
        pwd = epwd.substring(3); 
    } 

  
} 
public class customized_serialization_assignment {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Account g1 = new Account(); 
		  
        System.out.println("Username :" + g1.username + "       Password :" + g1.pwd); 
  
        FileOutputStream fos = new FileOutputStream("abc.ser"); 
  
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
  
        // writeObject() method on Account class will 
        // be automatically called by jvm 
        oos.writeObject(g1); 
  
        FileInputStream fis = new FileInputStream("abc.ser"); 
  
        ObjectInputStream ois = new ObjectInputStream(fis); 
  
      Account g2 = (Account)ois.readObject(); 
  
        System.out.println("Username :" + g2.username +  
                             "       Password :" + g2.pwd); 
	}

}
