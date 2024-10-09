public class CustomStringMethods {
    public CustomStringMethods() { }

    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() > maxLength) {
            return true;
        } else return false;
    }

    public String funnyString(String str, int idx) {
        String letter = str.substring(idx, idx + 1);
        return letter + str + letter;
    }

    public String halvesReversed(String myString) {
        String reversed = myString.substring(myString.length() / 2);
        String reversed2 = myString.substring(0, myString.length() / 2);
        return reversed + reversed2;
    }
  
}
  
  