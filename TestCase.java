package userregistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	
	UserRegistration registration = new UserRegistration();

	@Test
	public void testFirstName() {
		
		assertTrue(registration.firstName("Dolly"));
		
	}
	
	@Test
	public void testLastName() {
		assertTrue(registration.lastName("Patil"));
	}
	
	@Test
	public void testEmailID() {
		assertTrue(registration.emailId("abc-xyz@gmail.com.in"));
	}
	
	@Test
	public void testMobileNumber() {
		assertTrue(registration.mobileNumber("91 9960322320"));
	}
	
	@Test
	public void testPassword() {
		assertTrue(registration.password("Dolly@78"));
	}

}
