import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserService {

	public boolean login(User user){
		boolean ret = false;
		if (user.getName().length() > 5 && existNumLetter(user.getPwd())) {
			ret = true;
		}
		return ret;
	}
	
	private boolean existNumLetter(String str){
		Pattern p1 = Pattern.compile("[A-Za-z]");
		Matcher m1 = p1.matcher(str);
		Pattern p2 = Pattern.compile("[0-9]");
		Matcher m2 = p2.matcher(str);
		return m1.find() && m2.find();
	}
	
}
