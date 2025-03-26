public class SubstringCheck {
    public static void main(String[] args) {
        String mainString = "This is Pikachu standards";
        String subString = "pikachu";

        boolean isPresent = mainString.toLowerCase().contains(subString.toLowerCase());

        if (isPresent) {
            System.out.println("Substring is present in the main string");
        } else {
            System.out.println("Substring is not present in the main string");
        }
    }

    //In many string processing applications,it is necessary to change the contents of a string i.e it needs to be mutable
//The string Builder class is used for manipulating the contents of a string
//a.Replacing the character
//b.Appending a string with another string
//c.Deleting a portion of a string

