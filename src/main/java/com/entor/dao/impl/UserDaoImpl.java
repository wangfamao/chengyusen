package com.entor.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.entor.bean.User;
import com.entor.dao.UserDao;
@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	private static final String namespace = "User";
	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	@Override
	public User  queryById(int id) {
		
      return getSqlSession().selectOne(namespace+".queryById",id);		
	}
	@Override
	public void add(User user) {
		// TODO 自动生成的方法存根
		getSqlSession().update(namespace+".add",user);	
	}
	@Override
	public User login(User user) {
		// TODO 自动生成的方法存根
		return getSqlSession().selectOne(namespace+".login",user);	
	}
	@Override
	public List<User> queryAll() {
		// TODO 自动生成的方法存根
		return getSqlSession().selectList(namespace+".queryAll");
	}
	@Override
	public void deleteById(int id) {
		getSqlSession().delete(namespace+".deleteById");
		
	}

}
