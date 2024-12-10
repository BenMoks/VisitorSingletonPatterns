public class SingleObject {
    private static SingleObject instance = new SingleObject();

    // Private constructor to prevent instantiation
    private SingleObject() {}

    // Get the only instance
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, Singleton!");
    }
}
