package com.example.Authentication;


import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;
import com.example.Authentication.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntityTests {
	@Test
	public void getAndSetPassword() {
		User testUser = new User();
		
		testUser.setPassword("mypassword");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
	@Test
	public void getAndSetName() {
		User testUser = new User();
		
		testUser.setName("abc");
		assertEquals(testUser.getName(),"abc");
	}
	
	@Test
	public void getAndSetEmail() {
		User testUser = new User();
		
		testUser.setEmail("abc@gmail.com");
		assertEquals(testUser.getEmail(),"abc@gmail.com");
	}
	
	@Test
	public void checkToString() {
		User testUser = new User();
		
		assertNotNull(testUser.toString());
	}
	
	@Test
	public void checkConstructor() {
		User testUser = new User("abc","abc@gmail.com","Abc@123");
		
		User checkUser = new User();
		checkUser.setName("abc");
		checkUser.setEmail("abc@gmail.com");
		checkUser.setPassword("Abc@123");
		
		assertEquals(testUser.getName(), checkUser.getName());
		assertEquals(testUser.getEmail(), checkUser.getEmail());
		assertEquals(testUser.getPassword(), checkUser.getPassword());
	}
	
	@Test
	public void testDefaultConstructor() {
		User testUser = new User();
		
		assertNotNull(testUser);
	}
}
