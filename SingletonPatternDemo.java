public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Get the only instance of SingleObject
        SingleObject object = SingleObject.getInstance();

        // Show the message
        object.showMessage();
    }
}
