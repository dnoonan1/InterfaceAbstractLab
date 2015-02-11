package lab1;

/**
 * The {@code IntroJavaCourse} class extends {@code ProgrammingCourse} and stores the 
 * information for an intro to Java course. It inherits fields from
 * {@code ProgrammingCourse}, such as course name and number, number of credits, and
 * prerequisites.
 * 
 * @author      Dan Noonan
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    
    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
        setMinCredits(0.0);
        setMaxCredits(5.0);
    }
    
}
