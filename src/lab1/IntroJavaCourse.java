package lab1;

/**
 * The {@code IntroJavaCourse} class extends {@code Course} and stores the 
 * information for an intro to Java course. It inherits fields from
 * {@code Course}, such as course name and number, number of credits, and
 * prerequisites. The setCredits() method is overridden to ensure the number of
 * credits is between 0 and 5.
 * 
 * @author      Dan Noonan
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
    
    private static final double MIN_CREDITS = 0;
    private static final double MAX_CREDITS = 5;
    
    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            error("Error: credits must be in the range " + MIN_CREDITS
                    + " to " + MAX_CREDITS);
        }
        super.setCredits(credits);
    }
}
