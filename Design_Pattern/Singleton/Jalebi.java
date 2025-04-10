public class Jalebi {
    // eager way to creating singleton object
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebi() {
        return jalebi;
    }
}
