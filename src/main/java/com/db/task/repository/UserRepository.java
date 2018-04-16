package com.db.task.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.db.task.vo.User;
import com.db.task.vo.UserView;

@Transactional
@Repository
public class UserRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<User> getArticleById() {
		String hql = "FROM User";
		List<User> user = entityManager.createQuery(hql).getResultList();
		System.out.println(user.get(0).getName());
		return user;
	}
	
	public List<UserView> getUserView() {
		String hql = "FROM UserView";
		List<UserView> user = entityManager.createQuery(hql).getResultList();
		System.out.println(user.get(0).getName()+"----");
		return user;
	}
	
}
