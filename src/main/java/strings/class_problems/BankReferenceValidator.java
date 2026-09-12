public class BankReferenceValidator {
    static String normalizeReference(String raw) {
        raw = raw.trim();
        return raw.substring(0, 3).toUpperCase() + raw.substring(3);
    }
    static String validateAndFormat(String r) {
        if (r.length() != 14) return "Wrong length";
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(r.charAt(i))) return "Non-letter bank code";
        }
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(r.charAt(i))) return "Non-digit body";
        }
        StringBuilder s = new StringBuilder();
        s.append("[").append(r.substring(0, 3)).append("]");
        s.append(" Date : ");
        s.append(r.substring(3, 5)).append("/").append(r.substring(5, 7)).append("/");
        s.append(r.substring(7, 9)).append(" | Seq : ");
        s.append(r.substring(9));
        return s.toString();
    }
    public static void main(String[] args) {
        String r = normalizeReference("abc12082612345");
        System.out.println(validateAndFormat(r));
    }
}
