package demo;

import entities.User;
import services.ServiceUser;
import services.ServiceUserFactory;

public class DemoService {
	
	
	
	public static void main(String[] args) {  
        ServiceUser serviceUser = ServiceUserFactory.getRemoteServiceUserMemory();
        
        System.out.println("\n----CREATE------\n");
        
        serviceUser.create(new User(1,  "Tomas", "pass" ));
        serviceUser.create(new User(2,  "Juan", "pass" ));
        serviceUser.create(new User(3,  "Maria", "pass" ));
        
        serviceUser.listUsers();
        System.out.println("\n----GET------\n");
        
        User u1 =  serviceUser.getById(1);
        
        System.out.println(u1);
        
        
        u1.setUserPass("Password");
        
        serviceUser.update(u1);
        
        System.out.println("\n----UPDATE----\n");
        
        serviceUser.listUsers();
        
        System.out.println("\n-----DELETE----\n");
        
        serviceUser.delete(3);
        
        serviceUser.listUsers();

        
	}
        

}
