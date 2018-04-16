package com.db.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.db.task.repository.UserRepository;
import com.db.task.vo.User;
import com.db.task.vo.UserView;

@RestController
public class Controller {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "user", method = RequestMethod.GET)
	public List<User> getAllUser() {
		return userRepository.getArticleById();
	}

	@RequestMapping(value = "userView", method = RequestMethod.GET)
	public List<UserView> getAllUserView() {
		return userRepository.getUserView();
	}
}
