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
		// TODO �Զ����ɵķ������
		return userdao.queryById(id);
	}
	@Override
	public void add(User user) {
		// TODO �Զ����ɵķ������
		 userdao.add(user);
		
	}
	@Override
	public User login(User user) {
		// TODO �Զ����ɵķ������
		return userdao.login(user);
	}
	@Override
	public List<User> queryAll() {
		// TODO �Զ����ɵķ������
		return userdao.queryAll();
	}
	@Override
	public void deleteById(int id) {
		
		userdao.deleteById(id);
		
	}

}
