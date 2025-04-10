public class Samosa {

    private static Samosa samosa;

    // Constructor
    private Samosa() {

    }
    // Lazy way to creating singleton object
    public static Samosa getSamosa() {
        // object of htis class
        if(samosa == null) {
            synchronized (Samosa.class) {
                if(samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }
}