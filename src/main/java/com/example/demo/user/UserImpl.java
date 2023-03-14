package com.example.demo.user;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class UserImpl extends GenericAbstractServices<User> {

	@Autowired
	protected UserImpl(UserDaoImpl uDao) {
		super(uDao);
	}


	


}
