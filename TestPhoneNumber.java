import org.junit.Assert;
import org.junit.Test;

public class TestPhoneNumber {
    int[][] keypad = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {' ',0,' '}
    };


    @Test
    public void testValidIsEasyDial() {
        Assert.assertTrue(PhoneNumber.isEasyToDail(keypad, "123-6569"));
        Assert.assertTrue(PhoneNumber.isEasyToDail(keypad, "159632470"));
    }

    @Test
    public void testIsEasyDialWithWrongCases() {
        Assert.assertFalse(PhoneNumber.isEasyToDail(keypad, "132-6569"));
        Assert.assertFalse(PhoneNumber.isEasyToDail(keypad, "15691"));
        Assert.assertFalse(PhoneNumber.isEasyToDail(keypad, "123-456"));
    }

    @Test
    public void testInValidIsEasyDial() {
        Assert.assertFalse(PhoneNumber.isEasyToDail(keypad, "abc"));
        Assert.assertFalse(PhoneNumber.isEasyToDail(keypad, "159632470a"));
        Assert.assertFalse(PhoneNumber.isEasyToDail(keypad, "0 9"));
    }

    @Test
    public void testIsEasyDialWithNull() {
        Assert.assertFalse(PhoneNumber.isEasyToDail(keypad, null));
    }

    @Test
    public void testIsEasyDialWithEmptyString() {
        Assert.assertFalse(PhoneNumber.isEasyToDail(keypad, ""));
    }
}
