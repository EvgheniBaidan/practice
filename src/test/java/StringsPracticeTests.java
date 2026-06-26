import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsPracticeTests {
    private final StringsPractice stringsPractice = new StringsPractice();
    @Test
    public void isTheStringPalindromePositive(){ // positive test scenario
     assertEquals(true, stringsPractice.isTheStringPalindrome("abba"),"Verify String is palindrome!");
    }
    @Test
    public void checkIsStringNotPalindrome() {
        assertEquals(false, stringsPractice.isTheStringPalindrome("arta"), "Verify the String is Not Palindrome");
    }
    @Test
    public void checkEmptyStringIsNotPalindrome() {
        assertEquals(false, stringsPractice.isTheStringPalindrome(""), "String is Empty, Not Palindrome!");
    }
}
