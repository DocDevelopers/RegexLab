import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Doc on 2/19/16.
 */
public class DataValidatorTest {










    @Test
    public void testIsValidUsername() throws Exception {
        String FALSE_UNAME1 = "df";
        String FALSE_UNAME2 = "_asdfs";
        String FALSE_UNAME3 = "?fasdfad";
        String FALSE_UNAME4 = ".affsdfasdf";
        String FALSE_UNAME5 = "abcdefghitdshakejfisdaefsd";
        String TRUE_UNAME1 = "francisco";
        String TRUE_UNAME2 = "can";
        String TRUE_UNAME3 = "lisa";
        String TRUE_UNAME4 = "doctorcito";

        assertEquals("Expected false username", false, DataValidator.isValidUsername(FALSE_UNAME1));
        assertEquals("Expected false username", false, DataValidator.isValidUsername(FALSE_UNAME2));
        assertEquals("Expected false username", false, DataValidator.isValidUsername(FALSE_UNAME3));
        assertEquals("Expected false username", false, DataValidator.isValidUsername(FALSE_UNAME4));
        assertEquals("Expected false username", false, DataValidator.isValidUsername(FALSE_UNAME5));

        assertEquals("Expected true username", true, DataValidator.isValidUsername(TRUE_UNAME1));
        assertEquals("Expected true username", true, DataValidator.isValidUsername(TRUE_UNAME2));
        assertEquals("Expected true username", true, DataValidator.isValidUsername(TRUE_UNAME3));
        assertEquals("Expected true username", true, DataValidator.isValidUsername(TRUE_UNAME4));
    }

    @Test
    public void testIsValidEnhancedUsername() throws Exception {
        String FALSE_UNAME1 = "francisco";
        String FALSE_UNAME2 = "2asda";
        String FALSE_UNAME3 = "FR1_42";
        String FALSE_UNAME4 = "_asd3";
        String TRUE_UNAME1 = "A234_";
        String TRUE_UNAME2 = "b";
        String TRUE_UNAME3 = "A_";
        String TRUE_UNAME4 = "D_1234";

        assertEquals("Expected false username", false, DataValidator.isValidEnhancedUsername(FALSE_UNAME1));
        assertEquals("Expected false username", false, DataValidator.isValidEnhancedUsername(FALSE_UNAME2));
        assertEquals("Expected false username", false, DataValidator.isValidEnhancedUsername(FALSE_UNAME3));
        assertEquals("Expected false username", false, DataValidator.isValidEnhancedUsername(FALSE_UNAME4));

        assertEquals("Expected true username", true, DataValidator.isValidEnhancedUsername(TRUE_UNAME1));
        assertEquals("Expected true username", true, DataValidator.isValidEnhancedUsername(TRUE_UNAME2));
        assertEquals("Expected true username", true, DataValidator.isValidEnhancedUsername(TRUE_UNAME3));
        assertEquals("Expected true username", true, DataValidator.isValidEnhancedUsername(TRUE_UNAME4));
    }

    @Test
    public void testisValidIP() throws Exception{
        String TRUE_IP1 = "127.0.0.1";
        String TRUE_IP2 = "10.0.0.1";
        String TRUE_IP3 = "192.168.1.1";
        String TRUE_IP4 = "8.8.8.8";
        String FALSE_IP1 = "1237.0.0.1";
        String FALSE_IP2 = "10.0.3440.1";
        String FALSE_IP3 = "192.289.1.1";
        String FALSE_IP4 = "8.8.853.8";

        assertEquals("Expected true", true, DataValidator.isValidIP(TRUE_IP1));
        assertEquals("Expected true", true, DataValidator.isValidIP(TRUE_IP2));
        assertEquals("Expected true", true, DataValidator.isValidIP(TRUE_IP3));
        assertEquals("Expected true", true, DataValidator.isValidIP(TRUE_IP4));

        assertEquals("Expected false", false, DataValidator.isValidIP(FALSE_IP1));
        assertEquals("Expected false", false, DataValidator.isValidIP(FALSE_IP2));
        assertEquals("Expected false", false, DataValidator.isValidIP(FALSE_IP3));
        assertEquals("Expected false", false, DataValidator.isValidIP(FALSE_IP4));



    }
}