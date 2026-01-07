package Java_Code_Series;

public class TNSet03 {

    // Question -1 Wap to convert a string to lowercase.
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase String: " + lowerStr);

        // Question -2 Wap to replace spaces with underscores in a given string.
        String name = " negi taniya 06";
        String replacString = name.replace(" ", "_");
        System.out.println("Original String: " + name);
        System.out.println("Replaced String: " + replacString);

        /*
         * Question -3 Wap to fill a letter template which looks like below:
         * String letterTemplate = "Dear <|name|>,You are selected! Date: <|date|>";
         */
        String letterTemplate = "Dear <|name|>,You are selected! Date: <|date|>";
        System.out.println(letterTemplate.replace("<|name|>", "Taniya").replace("<|date|>", "07/07/2026"));


        // Question -4 Wap to detect double and triple spaces in a string.
        String stringWithSpaces = "This  is a   string with double and triple spaces.";
        System.out.println(stringWithSpaces.indexOf("  "));
        System.out.println(stringWithSpaces.indexOf("   "));


        // Question -5 Wap to format the following letter using escape sequence characters.
        String letter = "Dear Taniya,\n\tYou are selected!\n\t\tDate: 07/07/2026";
        System.out.println(letter);
    }

}
