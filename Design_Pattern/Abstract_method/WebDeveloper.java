import factory_Method.Employee;

public class WebDeveloper implements Employee {
    
    @Override
    public int salary() {
        return 40000;
    }
    
    
    public String name() {
        System.out.println("I am a web developer");
        return "WEB DEVELOPER";
    }
}
