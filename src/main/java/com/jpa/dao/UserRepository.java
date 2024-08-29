package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.model.User;


public interface UserRepository extends CrudRepository<User,Integer> {
	public List<User> findByName(String name);
	public List<User> findByCity(String city);
	public List<User> findByNameAndCity(String name , String city);
	public List<User> findByNameStartsWith(String prefix);
	public List<User> findByCityContaining(String word);
	public List<User> findByIdGreaterThan(int id);
	//	public List<User> findByCityStartingWithAndEndingWith(String prefix, String suffix);

	//	JPQL queries
	@Query("select u from User u ")
	public List<User> getAllUsers();

	@Query("select u from User u WHERE name =:n")
	public List<User> getUsersByName(@Param("n") String name);

	// SQL queries
	@Query(value = "select name from User where name=?", nativeQuery = true)
	public String getUsers(String name);
}
