public class WordReversalEncoder {
    public static String reverseEachWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) return "";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                result.append(words[i].charAt(j));
            }
            if (i < words.length - 1) result.append(" ");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club"));
    }
}
