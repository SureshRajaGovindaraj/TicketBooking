package com.virtusa.springboot.service;

import com.virtusa.springboot.model.Admin;
import com.virtusa.springboot.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class AdminServiceImpl  implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	
	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.adminRepository.save(admin);
		
	}

	@Override
	public Admin getAdminById(long id) {
		// TODO Auto-generated method stub
		java.util.Optional<Admin> optional=adminRepository.findById(id);
		Admin admin=null;
		if(optional.isPresent()) {
			admin=optional.get();
		}else {
			throw new RuntimeException("Movie not Found for id::"+id);
		}
		return admin;
	}


	@Override
	public void deleteAdminById(long id) {
		// TODO Auto-generated method stub
		this.adminRepository.deleteById(id);
		
	}
    
}
