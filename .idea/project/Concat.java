public class Concat {
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        String first = "Hello, ";
        String second = "Boss!,This is Phani Kumar Pullela";
        String result = concatenateStrings(first, second);
        System.out.println("Concatenated String: " + result);
    }
}

