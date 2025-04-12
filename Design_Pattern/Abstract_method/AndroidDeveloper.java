public class AndroidDeveloper implements Employee {
    
    @Override
    public int salary() {
        return 50000;
    }
    
    public String name() {
        System.out.println("I am an Android Developer");
        return "ANDROID DEVELOPER";
    }
}
