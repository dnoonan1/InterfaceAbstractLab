package lab1;

import javax.swing.JOptionPane;

/**
 * The {@code Course} class stores information for a college course, including 
 * name, course number, number of credits, and prerequisites. It includes
 * methods for getting and setting each of these values. Setters ensure proper
 * values are accepted. Null or empty strings are not allowed for course name
 * and number. Credits must be greater than zero. Prerequisites is set to null
 * by default, in which case getPrerequisites() returns "None".
 * setPrerequisites() rejects null or empty strings, so that once it is called,
 * the course must have prerequisites. There is also an error() method which 
 * shows a message dialog and exits the program.
 * 
 * @author Dan Noonan
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public Course() {}
    
    public Course(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    
    public final String getCourseName() {
        return courseName;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            error("Error: courseName cannot be null or empty string");
        }
        this.courseName = courseName;
    }
    
    // This was originally in only AdvancedJavaCourse, but the method is so
    // generic it makes sense to have it here
    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            error("Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }
    
    public final double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0) {
            error("Error: credits must be greater than 0");
        }
        this.credits = credits;
    }
    
    public final String getPrerequisites() {
        if (prerequisites == null) { // only true if setPrerequisites() hasn't
                                     // been called
            return "None";
        }
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            error("Error: prerequisites cannot be null or empty string");
        }
        this.prerequisites = prerequisites;
    }
    
    public final void error(String msg) {
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
