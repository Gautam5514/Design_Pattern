public class Client {
    

    public static void main(String[] args) {

        // I want to get Android developer

        Employee e1 = EmployeeFactoty.getEmployee(new AndroidDevFactory());
        e1.name();
        Employee e2 = EmployeeFactoty.getEmployee(new WebDevFactory());
        e2.name();
    }
}
