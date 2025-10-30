// Course.java
public class Course {
    // Instance variables
    private String courseName;
    private int durationWeeks;
    private int studentsEnrolled;

    // Final variable (common for all courses)
    private final String CREATOR = "CodeMentor Academy";

    // Static variable to track total students across all courses
    private static int totalStudents = 0;

    // Parameterized constructor
    public Course(String courseName, int durationWeeks, int studentsEnrolled) {
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
        this.studentsEnrolled = studentsEnrolled;
        totalStudents += studentsEnrolled; // Update total students count
    }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (weeks): " + durationWeeks);
        System.out.println("Students Enrolled: " + studentsEnrolled);
        System.out.println("Course Creator: " + CREATOR);
        System.out.println("------------------------------------");
    }

    // Static method to get total students across all courses
    public static int getTotalStudents() {
        return totalStudents;
    }

    // Static nested class
    public static class Platform {
        public static void displayPlatformMessage() {
            System.out.println("Courses are hosted on CodeMentor.");
        }
    }
}
