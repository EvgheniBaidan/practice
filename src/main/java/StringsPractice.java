
public class StringsPractice {
    public boolean isTheStringPalindrome(String str) {
        StringBuilder strBuild = new StringBuilder(str);
        String reversedString = strBuild.reverse().toString();
       /* if (str.equals(reversedString) && !str.isEmpty()) {
        return true; }
        else { return false;} solutia cu if else*/
       // return str.equals(reversedString) && !str.isEmpty() ? true: false; solutia ternary operator
        return str.equals(reversedString) && !str.isEmpty();// solutie operatiune logica

    }
    public String makeArrayToString(char[] arr) {
        return "";
    }
    public byte countVowels(String str){
        return 1;
    }
    public byte countConsonants(String str){
        return 1;
    }
}
