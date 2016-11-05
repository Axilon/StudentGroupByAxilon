package homework3t2;

public class MyException extends Exception{
	
	@Override
	public String getMessage() {
		
		return "Sorry, but we don`t have free places for you,so we can`t add you to the group.";
	}
	
}