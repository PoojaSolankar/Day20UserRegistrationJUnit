package userregistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	
	UserRegistration registration = new UserRegistration();

	@Test
	public void testFirstName() {
		
		assertTrue(registration.firstName("Dolly"));
		
	}
}
