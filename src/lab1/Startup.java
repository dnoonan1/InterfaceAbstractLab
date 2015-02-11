package lab1;

/**
 * The {@code Startup} class is a driver to demonstrate classes
 IntroToProgramming, IntroJavaCourse, and AdvancedJavaCourse, all of which
 extend ProgrammingCourse. This architecture is efficient because significant amounts of
 code are reused. Getters and setters for courseName and courseNumber, and
 getters for credits and prerequisites are all final. Each subclass overrides
 setCredits() to make sure credits is in the proper range, and
 IntroToProgrammingCourse additionally overrides setPrerequisites() to prevent
 adding any prerequisites to this type of course.
 
 Although the architecture is efficient in terms of code reuse, it is also
 inflexible: most ProgrammingCourse methods are final, so very little can be changed by
 subclasses.
 
 See package lab2 for a different architecture which uses an interface instead
 of an abstract class.
 * 
 * @author      Dan Noonan
 * @version     1.00
 */
public class Startup {
    
    public static void main(String[] args) {
        
        // Liskov Substitution Principle
        ProgrammingCourse[] courses = {
            new IntroToProgrammingCourse("Intro to Programming", "152-007"),
            new IntroJavaCourse("Intro to Java", "152-134"),
            new AdvancedJavaCourse("Advanced Java", "152-135")
        };
        
        // The Liskov Substitution Principle is useful in this case since no
        // subclass of ProgrammingCourse adds any methods. If a subclass added methods and
        // we were dealing with a single course of that type, it would be better
        // to declare that object a type of the subclass rather than ProgrammingCourse. The
        // Liskov Substitution Principle is especially useful when you have
        // collections of objects, as we have here.
        
        // Set all courses to 4 credits
        for (ProgrammingCourse course : courses) {
            course.setCredits(4.0);
        }
        
        // Set prerequisites
        //courses[0].setPrerequisites("A ProgrammingCourse"); // causes an error
        courses[1].setPrerequisites("Intro to Programming");
        courses[2].setPrerequisites("Intro to Java");
        
        // Print out courses
        for (ProgrammingCourse course : courses) {
            System.out.println(course.getCourseNumber() + " "
                    + course.getCourseName()
                    + " (" + course.getCredits() + " credits; prerequisites: "
                    + course.getPrerequisites() + ")");
        }
        
    }
    
}
