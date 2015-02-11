package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Dan Noonan
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourse  {
    private String courseName;
    private String courseNumber;
    private double credits;
    private double minCredits = 0.0;
    private double maxCredits = 5.0;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    @Override
    public final String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    @Override
    public final double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < minCredits || credits > maxCredits) {
            error("Error: credits must be in the range " + minCredits + " to "
                    + maxCredits);
        }
        this.credits = credits;
    }
    
    @Override
    public double getMinCredits() {
        return minCredits;
    }
    
    @Override
    public void setMinCredits(double minCredits) {
        if (minCredits < 0.0) {
            error("minCredits must be greater than 0");
        }
        this.minCredits = minCredits;
    }
    
    @Override
    public double getMaxCredits() {
        return maxCredits;
    }
    
    @Override
    public void setMaxCredits(double maxCredits) {
        if (maxCredits < minCredits) {
            error("maxCredits must be greater than minCredits");
        }
        this.maxCredits = maxCredits;
    }

    @Override
    public final String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public final void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    // Added getter ans setter for courseName
    @Override
    public final String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            error("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }
    
    public final void error(String msg) {
        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}
