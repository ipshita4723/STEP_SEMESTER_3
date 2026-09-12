public class PhoneNumberMasker {
    public static String maskPhoneNumber(String phone) {
        if (phone.length() != 10 || !phone.matches("\\d+")) return "Invalid";
        StringBuilder sb = new StringBuilder("xxxxxx-");
        sb.append(phone.substring(6));
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(maskPhoneNumber("1234567890"));
    }
}
