package data;

import userServices.UserService;
import userServices.UserServiceFactory;

public class DemoUserService {
	public static void main(String[] args) {
		UserService userService = UserServiceFactory.getRemoteServiceUsingServiceMemory();
		         
		      //CREATE 
			userService.create(new User(0,  "Cami", "Rom", new Photo("photoUser", 0) ));
			userService.create(new User(1,  "Lalo", "Hash",new Photo("photoUser1", 0) ));
			userService.create(new User(2,  "Tom", "Toyo",new Photo("photoUser2", 0) ));
			userService.create(new User(3,  "Malcom", "Xar",new Photo("photoUser3", 0) ));
			userService.create(new User(4,  "Jhon", "Swiff",new Photo("photoUser4", 0) ));
			//READ
		    Integer idTest=0;     		        
		    System.out.println(userService.read(idTest));
		    System.out.println(userService.read(idTest+1));
		    System.out.println(userService.read(idTest+2));
		    System.out.println(userService.read(idTest+3));
		    System.out.println(userService.read(idTest+4));
		    //UPDATE
		    userService.update(new User(2, "Tomy", "toyo",new Photo("photoPupies", 0)));
		    System.out.println(" "+userService.read(2));
		    
		   
		    //DELETE
		    userService.delete(idTest);
		 
		    System.out.println("LIST");
		    userService.list();
		                           //// UPGRADE SERVICES
		    userService.createFriend(userService.read(idTest), userService.read(idTest+1));
		    userService.createFriend(userService.read(idTest+2), userService.read(idTest+3));
		    //likes photos
		    //userService.read(idTest+1).getPhoto().setPhotoLikes(1);
		    userService.addLike(userService.read(1));
		    userService.addLike(userService.read(3));
		    userService.addLike(userService.read(3));
		    //read friends
		    System.out.println("LIST FRIENDS");
		    userService.listFriends();
	}

}
