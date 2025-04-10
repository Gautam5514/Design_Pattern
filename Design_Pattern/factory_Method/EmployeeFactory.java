package factory_Method;

public class EmployeeFactory {

    // Factory Method to create objects
    public static Employee getEmployee(String empType) {
        if (empType == null || empType.isEmpty()) {
            return null;
        }

        if (empType.equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        } else if (empType.equalsIgnoreCase("Web Developer")) {
            return new WebDeveloper();
        } else {
            System.out.println("Invalid employee type provided: " + empType);
            return null;
        }
    }
}
