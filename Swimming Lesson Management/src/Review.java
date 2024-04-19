public class Review {
    private Student learner;
    private SwimmingLesson lesson;
    private int rating; // Rating from 1 to 5
    private String comment;

    public Review(Student learner, SwimmingLesson lesson, int rating, String comment) {
        this.learner = learner;
        this.lesson = lesson;
        this.rating = rating;
        this.comment = comment;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
