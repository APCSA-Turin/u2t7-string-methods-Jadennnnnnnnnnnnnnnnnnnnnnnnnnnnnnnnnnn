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

    public String pigLatin(String orig) {
        return orig.substring(1) + orig.substring(0, 1) + "ay";
    }

    public String removeCharacter(String myString, int removeIdx) {
        if (myString.length() <= removeIdx) {
            return myString;
        } else return myString.substring(0, removeIdx) + myString.substring(removeIdx + 1);
    }
    
    public String insertAt(String orig, String insertText, String searchStr) {
        int num = orig.indexOf(searchStr);
        if (orig.indexOf(searchStr) == -1){
            num = orig.length();
        }
        String str1 = orig.substring(0, num);
        String str2 = orig.substring(num);
        return str1 + insertText + str2;
    }

    public String endUp(String myString, int numToCap) {
        String upper = myString.substring(Math.max(0, myString.length() - numToCap));
        return myString.substring(0, Math.max(0, myString.length() - numToCap)) + upper.toUpperCase();
    }
    
    public String yellOrWhisper(String myString) {
        if (myString.substring(0, 1).equals(myString.substring(0, 1).toUpperCase())) {
            return myString.toUpperCase();
        } else return myString.toLowerCase();
    }

    public String starBetween(String myString) {
        String str = "";
        for (int i = 0; i < myString.length(); i++) {
            str += myString.charAt(i) + "*";
        }
        return str.substring(0, str.length() - 1);
    }
}
  
  