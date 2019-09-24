package com.entor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entor.bean.User;

public interface UserDao {
	
	public User queryById(int id);
	public void add(@Param("User") User user );
	public User login(@Param("User") User user);
	public List<User> queryAll();
	public void deleteById(int id);

}
