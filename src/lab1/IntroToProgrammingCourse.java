package lab1;

import javax.swing.JOptionPane;

/**
 * The {@code IntroToProgrammingCourse} class extends {@code ProgrammingCourse} and stores
 * the information for an intro to programming course. It inherits fields from
 * {@code ProgrammingCourse}, such as course name and number, number of credits, and
 * prerequisites.
 * 
 * Calling setPrerequisites() sends and error
 * because an {@code IntroToProgrammingCourse} cannot have any prerequisites.
 *
 * @author      Dan Noonan
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
        setMaxCredits(0.5);
        setMaxCredits(4.0);
    }

}
