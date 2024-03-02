// Class representing a Course
class Course {
    private CourseID courseId;
    private String courseName;

    // Constructors, getters, and setters
    public Course(CourseID courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public CourseID getCourseId() {
        return courseId;
    }

    public void setCourseId(CourseID courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
