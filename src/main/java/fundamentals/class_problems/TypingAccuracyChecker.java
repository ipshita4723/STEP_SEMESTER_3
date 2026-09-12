public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid input strings.");
            return;
        }
        if (original.length() != typed.length()) {
            System.out.println("Error: Input strings must be of equal length.");
            return;
        }
        int totalChars = original.length();
        int matched = 0;
        int firstMismatchPos = -1;
        char origChar = ' ', typedChar = ' ';
        for (int i = 0; i < totalChars; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1;
                origChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }
        double accuracy = ((double) matched / totalChars) * 100;
        if (firstMismatchPos == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n", matched, totalChars, accuracy);
        } else {
            System.out.println("Matched: " + matched + "/" + totalChars + " | Accuracy: " + String.format("%.2f", accuracy) + "% | First Mismatch at position " + firstMismatchPos + " (" + origChar + " vs " + typedChar + ")");
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }
}
