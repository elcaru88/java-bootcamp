package app;

import model.Photo;
import model.User;
import service.UserService;
import service.UserServiceFactory;

public class MainClass {

	public static void main(String[] args) {
		Photo userPhoto = new Photo("una linda foto");
		User user = new User("Fer", "password", userPhoto);
		
		Photo userPhotoFriend = new Photo("otra linda foto");
		User friend = new User("Amigo", "Amigo password", userPhotoFriend);
		
		
		
		 //Calling doThis with a local instance of the ServiceA, very useful for testing!!!!  
        UserService userService1 = UserServiceFactory.getLocalService();  
        userService1.createUser(user);
        //Calling doThis with a remote instance of the ServiceA using Web services.  
        UserService userService2 = UserServiceFactory.getRemoteServiceUsingWebService();  
        userService2.createUser(friend);  
        //Calling doThis with a remote instance of the ServiceA using Web services.  
        UserService userService3 = UserServiceFactory.getRemoteServiceUsingJms();  
        userService3.addFriend(user, friend); 
        userService1.likePhoto(user);
        

	}

}
