package lab1;

import javax.swing.JOptionPane;

/**
 * The {@code AdvancedJavaCourse} class extends {@code ProgrammingCourse} and stores the 
 * information for an advanced Java course. It inherits fields from
 * {@code ProgrammingCourse}, such as course name and number, number of credits, and
 * prerequisites.
 * 
 * @author      Dan Noonan
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
    
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4.0;
    
    public AdvancedJavaCourse (String courseName, String courseNumber) {
        super(courseName, courseNumber);
        setMinCredits(0.5);
        setMaxCredits(4.0);
    }
    
}
