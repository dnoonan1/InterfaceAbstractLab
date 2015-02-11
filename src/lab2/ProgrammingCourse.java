package lab2;

/**
 *
 * @author Dan Noonan
 */
public interface ProgrammingCourse {
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    public abstract String getCourseName();
    public abstract void setCourseName(String courseName);
    public abstract double getCredits();
    public abstract void setCredits(double credits);
    public abstract double getMinCredits();
    public abstract void setMinCredits(double minCredits);
    public abstract double getMaxCredits();
    public abstract void setMaxCredits(double maxCredits);
    public abstract String getPrerequisites();
    public abstract void setPrerequisites(String prerequisites);
}
