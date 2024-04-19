import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Timetable implements Serializable {
    private static final long serialVersionUID = 1L;

    private Day day;
    private List<SwimmingLesson> lessons;

    public Timetable(Day day) {
        this.day = day;
        this.lessons = new ArrayList<>();
    }
    public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    SUNDAY
    }

    // Getters and setters
    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public List<SwimmingLesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<SwimmingLesson> lessons) {
        this.lessons = lessons;
    }

    public void addLesson(SwimmingLesson lesson) {
        lessons.add(lesson);
    }

    public void removeLesson(SwimmingLesson lesson) {
        lessons.remove(lesson);
    }
}
