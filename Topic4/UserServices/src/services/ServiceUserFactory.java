package services;

public class ServiceUserFactory {
	
	 private ServiceUserFactory() {}
	 
	 public static ServiceUser getLocalService(){  
	        return new ServiceUserImp ();  
	    }
	 
	 public static ServiceUser getRemoteServiceUsingJms(){  
	        return new ServiceUserProxy (new ServiceUserJmsClient());  
	    }
	 
	 public static ServiceUser getRemoteServiceUsingWebService(){  
	        return new ServiceUserProxy (new ServiceUserWebServiceClient());  
	    } 
	 
	 public static ServiceUser getRemoteServiceUserMemory(){
		    return new ServiceUserProxy (new ServiceUserMemory());
	    }
	      

}
