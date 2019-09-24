package com.entor.service;

import java.util.List;

import com.entor.bean.User;

public interface UserService {

	
	public User queryById(int id);
	public void add(User user );
	public User login(User user);
	public List<User> queryAll();
	public void deleteById(int id);

}
