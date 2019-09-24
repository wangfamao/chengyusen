package com.entor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.bean.User;
import com.entor.dao.UserDao;
import com.entor.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userdao;
	@Override
	public User queryById(int id) {
		// TODO 自动生成的方法存根
		return userdao.queryById(id);
	}
	@Override
	public void add(User user) {
		// TODO 自动生成的方法存根
		 userdao.add(user);
		
	}
	@Override
	public User login(User user) {
		// TODO 自动生成的方法存根
		return userdao.login(user);
	}
	@Override
	public List<User> queryAll() {
		// TODO 自动生成的方法存根
		return userdao.queryAll();
	}
	@Override
	public void deleteById(int id) {
		
		userdao.deleteById(id);
		
	}

}
