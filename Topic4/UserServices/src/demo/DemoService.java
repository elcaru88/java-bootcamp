package demo;

import entities.Picture;
import entities.User;
import services.ServiceUser;
import services.ServiceUserFactory;

public class DemoService {
	
	
	
	public static void main(String[] args) {  
        ServiceUser serviceUser = ServiceUserFactory.getRemoteServiceUserMemory();
        
        System.out.println("\n----CREATE------\n");
        
        serviceUser.create(new User(1,"Tomas","pass", new Picture("https://eliaslealblog.files.wordpress.com/2014/03/user-200.png")));
        
        serviceUser.create(new User(2,"Juan","pass", new Picture("https://citizenmed.files.wordpress.com/2011/08/user-icon1.jpg")));
        
        serviceUser.create(new User(3,"Maria","pass", new Picture("http://i234.photobucket.com/albums/ee212/jonathannnnnnn/Render/Peter-Griffin-psd30524.png")));
        
        serviceUser.listUsers();
        
        System.out.println("\n----GET------\n");
        
        User u1 =  serviceUser.getById(3);
        
        u1.showUserPicture();
        
        System.out.println(u1);
        
        
        u1.setUserPass("Password");
        
        serviceUser.update(u1);
        
        System.out.println("\n----UPDATE----\n");
        
        serviceUser.listUsers();
        
        System.out.println("\n-----DELETE----\n");
        
        serviceUser.delete(2);
        
        serviceUser.listUsers();
        
        System.out.println("\n-----ADD FRIEND----\n");
        
        serviceUser.addFriend( serviceUser.getById(1) , serviceUser.getById(3));
        
        serviceUser.listUsers();
        
        
        
	}
        

}
