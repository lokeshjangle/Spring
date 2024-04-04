import java.util.Locale;

public class StringMethod {
    public static void main(String[] args){
        String name = "Lokesh";
        System.out.println(name);

        //To find length of String
        int value = name.length();
        System.out.println("There are " + value + " Character in String");

        //To convert lowercase
        String lstring = name.toLowerCase();
        System.out.println("Convert into lowercase: " + lstring);

        //To convert uppercase
        String upstring = name.toUpperCase();
        System.out.println("Convert into Uppercase: " + upstring);


        //To Trimmed string: Trim is use to remove spaces
        String nonTrimmedString = "   Lokesh     ";
        System.out.println(nonTrimmedString);

        String TrimmedString = nonTrimmedString.trim();
        System.out.println(TrimmedString);

        System.out.println("Use of substring: " + name.substring(3)); //substring is use to print remaining string from specific index
        System.out.println(name.substring(1,5)); //This is another method of use of substring in this method we can print string from specific index to specific index + 1 (n to n+1)


        //To replace any character
        System.out.println("Replace Character 'k' to 'l' in string: " + name + " to "  + name.replace('k', 'l'));

        //Replace multiple character with multiple character
        System.out.println("Replace multiple character in string: " + name + " to " + name.replace("okesh", "ukky"));

        //Replace single character with multiple character
        System.out.println("Replace single to multiple character in string: " + name + " to " + name.replace("k", "Lokesh"));

        //Use of startwith method to check string will start from this character. It return in boolean value
        System.out.println("Can this string start with Lo: " + name.startsWith("Lo"));

        //Use of endswith method
        System.out.println("Can this string ends with sh: " + name.endsWith("sh"));

        //Use of charAt() method. Means what character at index
        System.out.println("What is the character at index 2: " + name.charAt(2));

        //Use of indexOf() method. which return first index of character & index no. start from following character
        System.out.println("Index of 'k': " + name.indexOf("k"));
        System.out.println("Index of 'sh': " + name.indexOf("sh", 2)); //fromindex is use to start string from given index

        //Use of lastIndexof() method. which return last index in string
        System.out.println("Last Index of string 'L': " + name.lastIndexOf("L"));

        //To check value or string are equal to another string or character use .equal(). it return boolean answer
        System.out.println("String are equal to 'Lokesh': " + name.equals("Lokesh"));

        //equalIgnoreCase() method is use to check string are equal to given string without checking uppercase or lowercase
        System.out.println("String are equal to 'Lokesh': " + name.equalsIgnoreCase("loKEsh")); //This method are not case-sensitive

    }
}