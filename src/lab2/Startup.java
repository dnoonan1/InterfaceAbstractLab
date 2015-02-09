package lab2;

/**
 * The {@code Startup} class is a driver to demonstrate classes
 * IntroToProgramming, IntroJavaCourse, and AdvancedJavaCourse, all of which
 * implement the interface Course. The main method is identical to the one in 
 * package lab1.
 * 
 * This package is similar to lab1 except that Course is an interface instead of
 * an abstract class.
 * 
 * This architecture lacks the code reuse of lab1. Fields are redeclared for
 * each class that implements Course. Methods must be implemented per class,
 * even though most are identical. However, the interface is extremely flexible
 * and could be used by a third party.
 * 
 * IntroToProgrammingCourse does not have a prerequisite field (since the course
 * has no prerequisites). The getter simply returns "None" and the setter sends
 * an error message.
 * 
 * @author      Dan Noonan
 * @version     1.00
 */
public class Startup {

    public static void main(String[] args) {
        
        // Liskov Substitution Principle
        lab1.Course[] courses = {
            new lab1.IntroToProgrammingCourse("Intro to Programming", "152-007"),
            new lab1.IntroJavaCourse("Intro to Java", "152-134"),
            new lab1.AdvancedJavaCourse("Advanced Java", "152-135")
        };
        
        // The Liskov Substitution Principle is useful in this case since no
        // subclass of Course adds any methods. If a subclass added methods and
        // we were dealing with a single course of that type, it would be better
        // to declare that object a type of the subclass rather than Course. The
        // Liskov Substitution Principle is especially useful when you have
        // collections of objects, as we have here.
        
        // Set all courses to 4 credits
        for (lab1.Course course : courses) {
            course.setCredits(4.0);
        }
        
        // Set prerequisites
        //courses[0].setPrerequisites("A Course"); // causes an error
        courses[1].setPrerequisites("Intro to Programming");
        courses[2].setPrerequisites("Intro to Java");
        
        // Print out courses
        for (lab1.Course course : courses) {
            System.out.println(course.getCourseNumber() + " "
                    + course.getCourseName()
                    + " (" + course.getCredits() + " credits; prerequisites: "
                    + course.getPrerequisites() + ")");
        }
        
    } 
    
}
