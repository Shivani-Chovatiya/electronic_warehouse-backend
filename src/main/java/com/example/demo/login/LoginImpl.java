package com.example.demo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImpl extends GenericAbstractService<LoginUser> {

	@Autowired
	protected LoginImpl(LoginDaoImpl lDao)
	{
		super(lDao);
	}
}
