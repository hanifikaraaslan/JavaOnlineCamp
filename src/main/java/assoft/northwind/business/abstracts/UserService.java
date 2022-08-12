package assoft.northwind.business.abstracts;

import assoft.northwind.core.entities.User;
import assoft.northwind.core.utilities.results.DataResult;
import assoft.northwind.core.utilities.results.Result;


public interface UserService {

	Result add (User user);  
	 
	 DataResult <User> findByEmail(String email);
	 

}
