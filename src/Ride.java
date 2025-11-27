/**
 * Class representing amusement rides in a theme park (e.g., roller coaster, water ride, ferris wheel)
 * Encapsulates core attributes of a ride and maintains an association with an Employee (ride operator)
 * Serves as a foundational class for implementing queue management, ride cycles, and history tracking
 */
public class Ride {
    // Core attributes of the amusement ride (encapsulated as private fields for data security)
    private String rideName;       // Unique name of the ride (e.g., "Thunderbolt Roller Coaster")
    private int maxCapacity;       // Maximum number of visitors the ride can accommodate per cycle (used in Part 5)
    private Employee operator;     // Associated Employee object: Represents the staff member responsible for operating the ride

    /**
     * Default constructor (no-argument constructor)
     * Initializes ride attributes with default values when no parameters are provided
     */
    public Ride() {
        this.rideName = "Unknown";          // Default name if not specified
        this.maxCapacity = 2;               // Default capacity: 2 visitors per cycle
        this.operator = null;               // No operator assigned initially
    }

    /**
     * Parameterized constructor
     * Initializes all ride attributes with user-provided values, including data validation for capacity
     * @param rideName Unique name of the ride (e.g., "Wave Pool")
     * @param maxCapacity Maximum visitors per cycle (must be ≥ 1; defaults to 2 if invalid)
     * @param operator Employee object assigned to operate the ride
     */
    public Ride(String rideName, int maxCapacity, Employee operator) {
        this.rideName = rideName;
        // Validation: Ensure capacity is at least 1 (use default 2 if invalid input)
        this.maxCapacity = (maxCapacity >= 1) ? maxCapacity : 2;
        this.operator = operator;
    }

    // Getter and Setter methods (implement encapsulation: controlled access to private fields)

    /**
     * Get the unique name of the ride
     * @return String: Ride name (e.g., "Ferris Wheel")
     */
    public String getRideName() {
        return rideName;
    }

    /**
     * Set a new name for the ride
     * @param rideName New unique name to assign to the ride
     */
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    /**
     * Get the maximum number of visitors the ride can accommodate per cycle
     * @return int: Maximum capacity (≥ 1)
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Set the maximum capacity of the ride with data validation
     * @param maxCapacity New maximum capacity (must be ≥ 1; error message printed if invalid)
     */
    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity >= 1) {
            this.maxCapacity = maxCapacity; // Update capacity only if validation passes
        } else {
            System.out.println("Error: Max capacity must be at least 1"); // Error feedback for invalid input
        }
    }

    /**
     * Get the employee assigned to operate the ride
     * @return Employee: Operator of the ride (null if no operator is assigned)
     */
    public Employee getOperator() {
        return operator;
    }

    /**
     * Assign a new employee to operate the ride
     * @param operator New Employee object to set as the ride's operator
     */
    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    /**
     * Override toString() method
     * Returns a human-readable string representation of the Ride object
     * Includes ride name, capacity, and operator details (or "No operator assigned" if null)
     * @return String: Formatted string with complete ride information
     */
    @Override
    public String toString() {
        // Handle null operator case to avoid NullPointerExceptions
        String operatorInfo = (operator != null) ? operator.getName() + " (ID: " + operator.getEmployeeId() + ")" : "No operator assigned";
        return "Ride [Name: " + rideName + ", Max Capacity: " + maxCapacity + ", Operator: " + operatorInfo + "]";
    }
}