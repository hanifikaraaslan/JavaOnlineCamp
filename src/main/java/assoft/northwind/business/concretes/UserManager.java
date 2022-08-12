package assoft.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assoft.northwind.business.abstracts.UserService;
import assoft.northwind.core.dataAccess.UserDao;
import assoft.northwind.core.entities.User;
import assoft.northwind.core.utilities.results.DataResult;
import assoft.northwind.core.utilities.results.Result;
import assoft.northwind.core.utilities.results.SuccessDataResult;
import assoft.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {
private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
	super();
	this.userDao = userDao;
}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>
		(this.userDao.findByEmail(email), "Kullanıcı bulundu");
	}

}
