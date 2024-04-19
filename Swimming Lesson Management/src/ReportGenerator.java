import java.util.List;

public class ReportGenerator {
    public static void generateStudentReport(List<Student> students) {
        System.out.println("===== Student Report =====");
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            System.out.println("Booked lessons: " + student.getBookedLessons().size());
            // Add methods to get cancelled and attended lessons
            System.out.println("Cancelled lessons: " + student.getCancelledLessons().size());
            System.out.println("Attended lessons: " + student.getAttendedLessons().size());
            System.out.println();
        }
    }

    public static void generateCoachReport(List<Coach> coaches) {
        System.out.println("===== Coach Report =====");
        for (Coach coach : coaches) {
            System.out.println("Coach: " + coach.getName());
            // Add method to calculate average rating
            System.out.println("Average Rating: " + coach.calculateAverageRating());
            System.out.println();
        }
    }
}
