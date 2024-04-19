import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SwimmingSchoolApp extends JFrame {
    private List<SwimmingLesson> swimmingLessons;
    private List<Student> students;
    private List<Coach> coaches;

    // Define Gender enum within the SwimmingSchoolApp class
    public enum Gender {
        MALE,
        FEMALE
    }
    enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    SUNDAY
}

    public SwimmingSchoolApp() {
        super("Swimming Lesson Management");

        // Initialize swimming lessons, students, and coaches
        swimmingLessons = new ArrayList<>();
        students = new ArrayList<>();
        coaches = new ArrayList<>();

        // Set up the main frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

        // Create components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2)); // Adjust layout for better organization

        // Create labels and fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel genderLabel = new JLabel("Gender:");
        JComboBox<String> genderComboBox = new JComboBox<>(new String[]{"Male", "Female"});
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();
        JLabel emergencyLabel = new JLabel("Emergency Contact:");
        JTextField emergencyField = new JTextField();
        JLabel gradeLabel = new JLabel("Grade Level:");
        JTextField gradeField = new JTextField();
        JLabel dayLabel = new JLabel("Day:");
        JComboBox<String> dayComboBox = new JComboBox<>(new String[]{"MONDAY", "WEDNESDAY", "FRIDAY", "SATURDAY"});
        JLabel timeLabel = new JLabel("Time:");
        JTextField timeField = new JTextField();

        JButton addLessonButton = new JButton("Add Lesson");
        addLessonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve input values
                String name = nameField.getText();
                String genderStr = (String) genderComboBox.getSelectedItem();
                int age;
                int gradeLevel;
                try {
                    age = Integer.parseInt(ageField.getText());
                    gradeLevel = Integer.parseInt(gradeField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(SwimmingSchoolApp.this, "Please enter valid age and grade level.");
                    return;
                }
                String emergencyContact = emergencyField.getText();
                String dayStr = (String) dayComboBox.getSelectedItem();
                String time = timeField.getText();

                // Validate input values
                if (name.isEmpty() || emergencyContact.isEmpty() || dayStr.isEmpty() || time.isEmpty()) {
                    JOptionPane.showMessageDialog(SwimmingSchoolApp.this, "Please fill in all fields.");
                    return;
                }

                Gender gender;
                try {
                    gender = Gender.valueOf(genderStr.toUpperCase());
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(SwimmingSchoolApp.this, "Invalid gender value.");
                    return;
                }

                // Convert day string to Day enum
                Day day;
                try {
                    day = Day.valueOf(dayStr.toUpperCase());
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(SwimmingSchoolApp.this, "Invalid day value.");
                    return;
                }

                // Validate age and grade level
                if (age < 4 || age > 11) {
                    JOptionPane.showMessageDialog(SwimmingSchoolApp.this, "Age must be between 4 and 11.");
                    return;
                }
                if (gradeLevel < 0 || gradeLevel > 5) {
                    JOptionPane.showMessageDialog(SwimmingSchoolApp.this, "Grade level must be between 0 and 5.");
                    return;
                }

                // Creating a Coach object
                Coach coach = new Coach("Helen");

                // Creating a Student object
                Student student = new Student(name);

                // Creating a SwimmingLesson object and adding the student
                SwimmingLesson lesson = new SwimmingLesson(day, time, gradeLevel, coach);
                lesson.addStudent(student);

                // Adding the lesson to the list of swimming lessons
                swimmingLessons.add(lesson);

                // Store student
                students.add(student);
                coach.addSwimmingLesson(lesson);

                // Display confirmation message
                JOptionPane.showMessageDialog(SwimmingSchoolApp.this, "Swimming lesson booked successfully!");
            }
        });

        // Add components to panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(genderLabel);
        panel.add(genderComboBox);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emergencyLabel);
        panel.add(emergencyField);
        panel.add(gradeLabel);
        panel.add(gradeField);
        panel.add(dayLabel);
        panel.add(dayComboBox);
        panel.add(timeLabel);
        panel.add(timeField);
        panel.add(addLessonButton); // Adjust layout for better organization

        // Add panel to frame
        add(panel);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwimmingSchoolApp();
            }
        });
    }
}
