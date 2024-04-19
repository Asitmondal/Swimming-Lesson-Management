import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SwimmingLesson implements Serializable {
    private static final long serialVersionUID = 1L;

    private Day day;
    private String time;
    private int gradeLevel;
    private Coach coach;
    private List<Student> students;

    public SwimmingLesson(Day day, String time, int gradeLevel, Coach coach) {
        this.day = day;
        this.time = time;
        this.gradeLevel = gradeLevel;
        this.coach = coach;
        this.students = new ArrayList<>();
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}
