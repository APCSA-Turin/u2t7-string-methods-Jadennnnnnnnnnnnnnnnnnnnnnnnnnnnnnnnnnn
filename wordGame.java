import java.util.Scanner;

public class wordGame {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int wordCount = 1;
        System.out.print("Enter first word: ");
        String str1 = scan.nextLine();


        while (score < 50) {
            System.out.print("Enter next word: ");
            String str2 = scan.nextLine();
            wordCount ++;

            if (str1.equals(str2)) {
                score -= 10;
                System.out.println("-10 points: current word the same; SCORE: " + score);
            } else if (str1.compareTo(str2) < 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else if (str1.compareTo(str2) > 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            }

            if (str1.substring(str1.length() - 2).equals(str2.substring(0, 2))) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous word matches first 2 of current word; SCORE: " + score);
            }
            
            if (str2.indexOf(str1.substring(0, 1)) > -1) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }

            if (str1.length() == str2.length()) {
                score += 5;
                System.out.println("+5 points: length of both words are the same; SCORE: " + score);
            }

            str1 = str2;
            System.out.println();
        }
        System.out.println("You WIN! It took you " + wordCount + " words! Play again to get a lower score");
        scan.close();
    }
}