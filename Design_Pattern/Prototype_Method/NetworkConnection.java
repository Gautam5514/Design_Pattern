package Prototype_Method;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }
    
    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() {
        // Simulate loading data from a network connection
        
        this.importantData = "Very important data from ";
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            System.err.println("Thread was interrupted: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return this.ip + " : " + this.importantData;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}