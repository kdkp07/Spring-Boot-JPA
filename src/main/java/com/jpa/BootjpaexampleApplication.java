package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.model.User;


@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		//		User user1 = new User();
		//		user1.setCity("Delhi");
		//		user1.setName("Mohit Rathore");
		//		user1.setMobile("918384929d");
		//
		//		//1. saving single user
		//		//		User user12 = userRepository.save(user1);
		//		User user2 = new User();
		//		user2.setCity("Mumbai");
		//		user2.setName("Rohan Patil");
		//		user2.setMobile("923442239m");
		//
		//		// saving multiple users at a time
		//		List<User> list = List.of(user1,user2);
		//		Iterable<User> result = userRepository.saveAll(list);

		//		list.forEach(user->{
		//			System.out.println(user);
		//		});


		// 2. Updating an existing user
		//		Optional<User> optional =  userRepository.findById(103);
		//
		//		Iterable<User> users = 	userRepository.findAll();
		//		users.forEach(user->System.out.println(user));

		//		User user = optional.get();
		//		user.setCity("Indore");
		//		userRepository.save(user);
		//		System.out.println(user);

		// 3. deleting users
		//		userRepository.deleteById(102);
		//		userRepository.deleteAll(users);
		//		userRepository.deleteAll(users);

		// 4. Custom finder methods.
		//		List<User> users = 	userRepository.findByNameAndCity("Raunak","Kolkata");
		//		List<User> users = userRepository.findByNameStartsWith("R");
		//		List<User> users = userRepository.findByCityContaining("i");
		//		List<User> users = userRepository.findByIdGreaterThan(100);

		//		5. Firing custom queries
		//		List<User> users = 	userRepository.getAllUsers();
		List<User> users = userRepository.getUsersByName("RAunak");
		users.forEach(e->System.out.println(e));
		System.out.println("====================Done====================");

		String name = userRepository.getUsers("Raunak");
		System.out.println(name);


	}

}
