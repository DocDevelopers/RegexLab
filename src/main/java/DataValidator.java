import java.util.regex.Pattern;

/**
 * Created by Doc on 2/19/16.
 */
public class DataValidator {
    private static final String USERNAME_REGEX = "[a-z]{3,25}";
    private static final String USERNAMEM_REGEX = "^[a-z A-Z][0-9_]*$";
    private static final String IP_REGEX = "\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";

    public static boolean isValidUsername(String username){
        if(Pattern.matches(USERNAME_REGEX, username))
            return true;
        return false;
    }

    public static boolean isValidEnhancedUsername(String username){
        if(Pattern.matches(USERNAMEM_REGEX, username))
            return true;
        return false;
    }

    public static boolean isValidIP(String address){
        if(Pattern.matches(IP_REGEX, address))
            return true;
        return false;
    }
}





