package userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean firstName(String name) {
		String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (name.matches(firstName)) {
			return true;
		}
		return false;
	}
}
