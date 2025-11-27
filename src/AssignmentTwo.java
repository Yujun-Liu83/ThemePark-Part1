/**
 * Main class for Assignment 2 - Theme Park Management System
 * Serves as the entry point for testing all components of the system
 * Contains methods to test different parts of the assignment requirements
 */
public class AssignmentTwo {

    // Method placeholders (to be implemented gradually later)
    /**
     * Placeholder method for testing Part Three requirements
     * Will contain logic for queue management functionality
     */
    public void partThree() {}

    /**
     * Placeholder method for testing Part Four A requirements
     * Will contain logic for basic ride history management
     */
    public void partFourA() {}

    /**
     * Placeholder method for testing Part Four B requirements
     * Will contain logic for sorting ride history
     */
    public void partFourB() {}

    /**
     * Placeholder method for testing Part Five requirements
     * Will contain logic for ride cycle operations
     */
    public void partFive() {}

    /**
     * Placeholder method for testing Part Six requirements
     * Will contain logic for exporting history to files
     */
    public void partSix() {}

    /**
     * Placeholder method for testing Part Seven requirements
     * Will contain logic for importing history from files
     */
    public void partSeven() {}

    /**
     * The main method (program entry point)
     * Used for initial testing of core classes and verifying basic functionality
     * @param args Command line arguments (not used in this initial test)
     */
    public static void main(String[] args) {
        // Create an instance of the assignment class to access test methods
        AssignmentTwo assignment = new AssignmentTwo();

        // Temporary test: Verify whether the code in Part 1 is running normally
        System.out.println("Part 1 Test: Classes created successfully!");

        // Test the Employee class
        // Create a new Employee object with sample data
        Employee operator = new Employee("John Doe", 35, "123-456-7890", "EMP001", "Roller Coaster");
        // Print the employee details using the overridden toString() method
        System.out.println(operator);

        // Test the Visitor class
        // Create a new Visitor object with sample data
        Visitor visitor = new Visitor("Jane Smith", 28, "987-654-3210", "TICKET001", "2025-11-28");
        // Print the visitor details using the overridden toString() method
        System.out.println(visitor);

        // Test the Ride class
        // Create a new Ride object with sample data (Thunderbolt roller coaster)
        Ride rollerCoaster = new Ride("Thunderbolt", 4, operator);
        // Print the ride details using the overridden toString() method
        System.out.println(rollerCoaster);
    }
}