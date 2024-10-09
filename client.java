public class client {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        System.out.println(methods.longerThan("Monkeys", 8));
        System.out.println(methods.funnyString("Monkeys", 5));
        System.out.println(methods.halvesReversed("Monkeys"));
        System.out.println(methods.pigLatin("Monkeys"));
        System.out.println(methods.removeCharacter("Monkeys", 8));
        System.out.println(methods.insertAt("Monkey", "Party", "o"));
        System.out.println(methods.endUp("Monkeys", 1));
        System.out.println(methods.yellOrWhisper("Monkeys"));
        System.out.println(methods.starBetween("Monkeys"));
    }
}
