package Prototype_Method;

public class Main {
    public static void main(String[] args ) throws InterruptedException {
        System.out.println("Creating object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();
        

        networkConnection.setIp("192.54.35.1");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        // We want new object of network connection 

        try{
            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();

            System.out.println(networkConnection1);
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
