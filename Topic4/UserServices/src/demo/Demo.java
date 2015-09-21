package demo;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import data.UserData;
import entities.User;
import services.ServiceUser;
import services.ServiceUserFactory;

public class Demo {
	
	
	
	public static void main(String[] args) {  
        ServiceUser serviceUser = ServiceUserFactory.getRemoteServiceUserMemory();
        
      
        serviceUser.create(new User(1,  "Tomas", "pass" ));
        serviceUser.create(new User(2,  "Juan", "pass" ));
        serviceUser.create(new User(3,  "Maria", "pass" ));
       
        serviceUser.listUsers();
        
        User modifiedUser = serviceUser.getById(2);
        
        if (modifiedUser == null) {
        	System.out.println("nulo");
			
		}
        
	}
        

}
