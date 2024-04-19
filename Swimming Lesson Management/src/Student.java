import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Lesson> bookedLessons;
    private List<Lesson> cancelledLessons;
    private List<Lesson> attendedLessons;

    public Student(String name) {
        this.name = name;
        this.bookedLessons = new ArrayList<>();
        this.cancelledLessons = new ArrayList<>();
        this.attendedLessons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void bookLesson(Lesson lesson) {
        bookedLessons.add(lesson);
    }

    public void cancelLesson(Lesson lesson) {
        bookedLessons.remove(lesson);
        cancelledLessons.add(lesson);
    }

    public void attendLesson(Lesson lesson) {
        bookedLessons.remove(lesson);
        attendedLessons.add(lesson);
    }

    public List<Lesson> getBookedLessons() {
        return bookedLessons;
    }

    public List<Lesson> getCancelledLessons() {
        return cancelledLessons;
    }

    public List<Lesson> getAttendedLessons() {
        return attendedLessons;
    }
}
