public class EmployeeFactoty {
    

    // get Employee
    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.creatEmployee();
    }
}
