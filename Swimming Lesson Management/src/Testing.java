import static org.junit.Assert.*;
import org.junit.Test;

public class Testing {

     @Test
    public void testAddStudent() {
        LessonBookingSystem system = new LessonBookingSystem();
        system.addStudent("John", "Male", "31-03-2000", "123434567");
        system.addStudent("Mary", "Female", "31-03-2000", "123434567");
        system.addStudent("Tom", "Male", "31-03-2000", "123434567");
        
        assertEquals(system.findStudentIndex("John"), 0);
        assertEquals(system.findStudentIndex("Mary"), 1);
        assertEquals(system.findStudentIndex("Tom"), 2);
    }

    @Test
    public void testAddCoach() {
        SwimmingSchoolApp system = new SwimmingSchoolApp();
        // Assuming you have a method to add a coach to the system
        system.addCoach("Tony");
        system.addCoach("Sam");
        system.addCoach("Peter");
        
        assertEquals(system.findCoachIndex("Tony"), 0);
        assertEquals(system.findCoachIndex("Sam"), 1);
        assertEquals(system.findCoachIndex("Peter"), 2);
        
        // Assuming coach is initialized somewhere in your code
        Coach coach = new Coach("Helen");
        // Assuming you have a method to book a lesson
        system.bookLesson("John", "Monday", "Morning", coach);
        assertEquals(system.getBookedLessonsForStudent("John").size(), 1);
        // Assuming you have a method to check if a time slot is booked
        assertTrue(coach.getTimeSlots().get(0).isBooked());
        // Assuming you have a method to cancel a lesson
        system.cancelLesson("John", 0);
        assertEquals(system.getBookedLessonsForStudent("John").size(), 0);
        assertFalse(coach.getTimeSlots().get(0).isBooked());
    }


   @Test
    public void testBookLesson() {
        SwimmingSchoolApp system = new SwimmingSchoolApp();
        Coach coach = new Coach("Helen");
        // Assuming you have a constructor for Student that takes only the name
        Student student = new Student("John");
        system.bookLesson(student, "Monday", "Morning", coach);
        assertEquals(system.getBookedLessonsForStudent("John").size(), 1);
        // Assuming you have a method to check if a time slot is booked
        assertTrue(coach.hasLessonBookedOn("Monday", "Morning"));
    }

    @Test
    public void testCancelLesson() {
        SwimmingSchoolApp system = new SwimmingSchoolApp();
        Coach coach = new Coach("Helen");
        // Assuming you have a constructor for Student that takes only the name
        Student student = new Student("John");
        // Assuming you have a method to book a lesson
        system.bookLesson(student, "Monday", "Morning", coach);
        // Assuming you have a method to cancel a lesson
        system.cancelLesson(student, 0);
        assertEquals(system.getBookedLessonsForStudent("John").size(), 0);
    }
}
