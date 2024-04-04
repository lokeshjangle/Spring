package example.spring.mvc.model;

public class UserValidator {

	public UserValidator() {
		
		
	}
	public static boolean isValid(User currentUser)
	{
		String currUserName = currentUser.getUserName();
		String currPwd = currentUser.getPassword();
		boolean success = false;
		
		//validating this user against hardcoded values
		if((currUserName.equals("Admin") || currUserName.equals("admin")) && currPwd.equals("1208")) {
			return true;
		}
		return false;
	}

}
