import java.io.Serializable;

public class Booking implements Serializable {
    private static final long serialVersionUID = 1L;

    private Student learner;
    private SwimmingLesson lesson;

    public Booking(Student learner, SwimmingLesson lesson) {
        this.learner = learner;
        this.lesson = lesson;
    }

    // Getters and setters
    public Student getLearner() {
        return learner;
    }

    public void setLearner(Student learner) {
        this.learner = learner;
    }

    public SwimmingLesson getLesson() {
        return lesson;
    }

    public void setLesson(SwimmingLesson lesson) {
        this.lesson = lesson;
    }
}
