public class Five {
    public static void main(String[] args) {
        String str = "Ashith";
        String newStr = "";
        newStr = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("String after removing vowel : " + newStr);
    }
}
