package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);

//		User user=new User();
//		user.setName("Rajneesh");
//		user.setCity("delhi");
//		user.setStatus("I am programmer");
//
//		User user1=userRepository.save(user);
//		System.out.println(user1);

		//create object of User
//		User user1=new User();
//		user1.setName("Uttam");
//		user1.setCity("Pune");
//		user1.setStatus("java programmer");
//
//		User user2=new User();
//		user2.setName("Vivek");
//		user2.setCity("Ayodhya");
//		user2.setStatus("Python programmer");

		//saving a single object
		//User resultuser=userRepository.save(user2);
//
//		List<User> users=List.of(user1,user2);
		// saving all objects
//		Iterable<User> result =userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//		});
//		//System.out.println("saved user "+user2);
//		System.out.println("done");

		// update   the user of id 252

//		Optional<User> optional= userRepository.findById(252);
//
//		User user= optional.get();
//		user.setName("Uttam Kumar");
//		User result= userRepository.save(user);
//		System.out.println(result);

		Iterable<User> itr= userRepository.findAll();
		//Iterator<User> iterator= itr.iterator();

//		while(iterator.hasNext())
//		{
//			User user=iterator.next();
//			System.out.println(user);
//		}

//		itr.forEach(new Consumer<User>(){
//			@Override
//			public void accept(User t){
//				System.out.println(t);
//			}
//		});
		itr.forEach(user -> System.out.println(user));


		// Deletion of user data

		//userRepository.deleteById(252);
		//System.out.println("Deleted");
//		Iterable<User> itr1=userRepository.findByName("Vivek");
//		itr1.forEach(user -> System.out.println(user));

		List<User> allUsers= userRepository.getAllUser();
		allUsers.forEach(e->{
			System.out.println(e);
		});
		System.out.println("_______________________________");
		List<User> result=userRepository.getUserByNameAndCity("Vivek","Ayodhya");
		result.forEach(e-> System.out.println(e));
		System.out.println("_______________________________");
		userRepository.getUsers().forEach(e-> System.out.println(e));

	}

}
