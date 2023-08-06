public class RemoveAllCharacter {

    public static String removeAll(String str, String ch) {
        String newStr = "";
        for (char c : str.toCharArray()) {
            if (c != ch.charAt(0)) {
                newStr += c;
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "hello world";
        String ch = "l";
        String newStr = RemoveAllCharacter.removeAll(str, ch);
        System.out.println(newStr); // heo word
    }
}
