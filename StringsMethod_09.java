package Java_Code_Series;

public class StringsMethod_09 {
    public static void main(String[] args) {
        String name = "Taniya negi";
        // it returns the length of string
        int val = name.length();
        System.out.println(val);
        System.out.println(name.length());
        // it returna the lowercase and uppercase of string
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // it removes the spaces before and after the string
        String na = "         Taniya negi           ";
        System.out.println(na);
        System.out.println(na.trim());
        // it returns a part of the string from the given index from where you want to
        // startor end it gives -1 if index is out of bound
        System.out.println(name.substring(2));
        System.out.println(name.substring(4, 9));
        // it replaces a character or string with new character or string
        System.out.println(name.replace('a', 'i'));
        System.out.println(name.replace("iya", "u"));
        // it checks whether the string starts with given sequence of char or contains
        // the sequence of char or ends with given sequence of char
        System.out.println(name.startsWith("Tan"));
        System.out.println(name.contains("ni"));
        System.out.println(name.endsWith("a"));
        // it returns the chaacter present at given index
        System.out.println(name.charAt(5));
        // it returns the index of first occurrence or last occurrence of given
        // character or string if not found it returns -1
        String newname = "taniyaiya";
        System.out.println(newname.indexOf("iya"));
        System.out.println(newname.indexOf("iya", 4));
        System.out.println(newname.lastIndexOf("iya"));
        System.out.println(newname.lastIndexOf("iya", 4));
        // it compares two strings and returns boolean value
        System.out.println(name.equals(newname));
        System.out.println(name.equals("Taniya negi"));
        // it compares two strings ignoring the case and returns boolean value
        System.out.println(name.equalsIgnoreCase("taNIya negi"));

    }
}