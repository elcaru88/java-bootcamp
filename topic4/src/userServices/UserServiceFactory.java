package userServices;

public class UserServiceFactory {
	
	public static UserService getLocalService() {
		return new UserServicesImp();
	}
	
	public static UserService getRemoteServiceUsingJms() {
		return new UserServiceProxy(new UserServiceJmsCliente());
	}
	
	public static UserService getRemoteServiceUsingWebServices(){
		return new UserServiceProxy(new UserServiceWebServiceClient());
	}
	
	public static UserService getRemoteServiceUsingServiceMemory(){
		return new UserServiceProxy(new UserServiceMemory());
	}


}
