public class Main {
    public static void main(String[] args) {
        String mainString = "This is Pikachu class";
        String subString = "pikachu";

        boolean isPresent = mainString.toLowerCase().contains(subString.toLowerCase());

        if (isPresent) {
            System.out.println("Substring is present in the main string");
        } else {
            System.out.println("Substring is not present in the main string");
        }
    }
}
