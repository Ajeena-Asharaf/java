// CourseTest.java
public class CourseTest {
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 6, 45);
        Course course2 = new Course("Python for Beginners", 8, 60);

        // Displaying course details
        System.out.println("=== Course Details ===");
        course1.displayDetails();
        course2.displayDetails();

        // Display total students across all courses
        System.out.println("Total Students Enrolled Across All Courses: " + Course.getTotalStudents());
        System.out.println();

        // Calling static nested class method
        Course.Platform.displayPlatformMessage();
    }
}
