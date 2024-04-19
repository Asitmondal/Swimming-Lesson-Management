import java.util.ArrayList;
import java.util.List;

public class Coach {
    private String name;
    private List<SwimmingLesson> swimmingLessons;

    public Coach(String name) {
        this.name = name;
        this.swimmingLessons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSwimmingLesson(SwimmingLesson lesson) {
        swimmingLessons.add(lesson);
    }

    public List<SwimmingLesson> getSwimmingLessons() {
        return swimmingLessons;
    }

    public double calculateAverageRating() {
        // Implement calculation logic here
        return 0.0;
    }
}
