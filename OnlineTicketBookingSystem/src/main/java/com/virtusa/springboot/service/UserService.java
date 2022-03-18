package com.virtusa.springboot.service;

import com.virtusa.springboot.model.User;
import com.virtusa.springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);


}
