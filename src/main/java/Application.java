public class Application {
    /**
     * This class contains a main method that allows you to manually test the HardcodedLogin challenge functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * The Lab.login method should return true if a login should be permitted given two values.
     */
    public static void main(String[] args) {
        Lab thrower = new Lab();
        System.out.println("The lab code should throw an unchecked exception, causing a stack trace to be printed to console here:");
        thrower.throwUncheckedException();
        System.out.println("\nIf this line was printed to console, then throwing an exception was unsuccessful.");
    }
}
