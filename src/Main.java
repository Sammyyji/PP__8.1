public class Main {
    public static void main(String[] args) {
        System.out.println(printDays(12));
    }

    public static String printDays(int day) {
        if (day > 0)
            return printDays(day - 1) + getVerse(day) + "\n";
        return "";
    }

    public static String getVerse(int day) {
        String[] dayNames = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] verses = {"a partridge in a pear tree.", "two turtle doves", "three French hens", "four calling birds",
                "five golden rings", "six geese a-laying", "seven swans a-swimming", "eight maids a-milking",
                "nine ladies dancing", "ten lords a-leaping", "eleven pipers piping", "twelve drummers drumming"};

        return "On the " + dayNames[day - 1] + " day of Christmas, my true love gave to me, "+ buildVerse(day);

    }

    public static String buildVerse(int day) {
        String[] verses = {"a partridge in a pear tree.", "two turtle doves", "three French hens", "four calling birds",
                "five golden rings", "six geese a-laying", "seven swans a-swimming", "eight maids a-milking",
                "nine ladies dancing", "ten lords a-leaping", "eleven pipers piping", "twelve drummers drumming"};
        if (day == 1)
            return verses[0];
            return verses[day - 1] + ", " + buildVerse(day - 1);
    }
}
