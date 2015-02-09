package lab1;

import javax.swing.JOptionPane;

/**
 * The {@code AdvancedJavaCourse} class extends {@code Course} and stores the 
 * information for an advanced Java course. It inherits fields from
 * {@code Course}, such as course name and number, number of credits, and
 * prerequisites. The setCredits() method is overridden to ensure the number of
 * credits is between 0.5 and 4.
 * 
 * @author      Dan Noonan
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course {
    
    private static final double MIN_CREDITS = 0.5;
    private static final double MAX_CREDITS = 4.0;
    
    public AdvancedJavaCourse (String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }
    
    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            error("Error: credits must be in the range " + MIN_CREDITS
                    + " to " + this.MAX_CREDITS);
        }
        super.setCredits(credits);
    }
}
