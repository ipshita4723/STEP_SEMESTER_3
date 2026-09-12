public class StudentRecordParser {
    static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");
        if (fields.length == 3) {
            System.out.println("Name : " + fields[0] + " | Rollno : " + fields[1] + " | Dept : " + fields[2]);
        } else {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        parseStudentRecord("Suranya, RA12345, CSE");
    }
}
