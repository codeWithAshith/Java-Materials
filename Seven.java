public class Seven {
    public static void main(String[] args) {
        String input = "aaaabbccaaaaaAAdd";
        char search = 'a';

        int count = input.length() - input.replace(String.valueOf(search), "").length();

        System.out.println("The Character '" + search + "' appears " + count + " times.");
    }
}
