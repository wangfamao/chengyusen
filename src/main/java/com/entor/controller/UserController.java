package com.entor.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entor.bean.User;
import com.entor.service.UserService;
@Controller
public class UserController {
	
	@RequestMapping("/getUser/{id}")
	public String queryAll(HttpServletRequest request,@PathVariable int id) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
		UserService service = (UserService)context.getBean("userService");	
		request.setAttribute("user", service.queryById(id));
		return "index";
	}
	
	@RequestMapping("/addForm")
	public String add() {
		//�ض���
		return "redirect:addForm.jsp";
	}
	
	
	@RequestMapping(value="/add",produces="text/html; charset=utf-8")
	@ResponseBody
	public String add(User user) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
		UserService service = (UserService)context.getBean("userService");
		service.add(user);
		return "ע��ɹ�";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,User user) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
		UserService service = (UserService)context.getBean("userService");
		User u=service.login(user);
		if(u!=null) {
			user.setId(u.getId());
			request.setAttribute("list",service.queryAll());
			System.out.println(u);
			return "list";
		}else {
			return "login";
		}
		
	}
	@RequestMapping("/log")
	public String login() {
		//�ض���
		return "redirect:login.jsp";
	}
	
	//deleteById ����idɾ��
	@RequestMapping("/deleteById/{id}")
	public String deleteById(HttpServletRequest request,@PathVariable int id) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
		UserService service = (UserService)context.getBean("userService");
		service.deleteById(id);
		System.out.println(id +"ɾ���ɹ�");
		request.removeAttribute("list");
		request.setAttribute("list",service.queryAll());
		return "list";
	}
	
}
