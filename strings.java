import java.util.Scanner;

public class strings {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        if (str1.length() > str2.length()) {
            System.out.println(str1 + " is longer");
        } else if (str1.length() == str2.length()){
            System.out.println("Both strings have the same length");
        } else System.out.println(str2 + " is longer");

        System.out.println("First half: " + str1.substring(0, str1.length() / 2));
        System.out.println("Second half: " + str1.substring(str1.length() / 2));
        System.out.println("First half: " + str2.substring(0, str2.length() / 2));
        System.out.println("Second half: " + str2.substring(str2.length() / 2));

        int index = str1.indexOf(str2);
        if (index == -1) {
            System.out.println(str2 + " is not found in " + str1);
        } else System.out.println(str2 + " is found in " + str1 + " at index " + index);

        scan.close();
    }
}