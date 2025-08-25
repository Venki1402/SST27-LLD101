public class Demo07 {
    public static void main(String[] args) {
        Printable m = new BasicPrinter();
        m.print("Hello");

        // m.scan("/tmp/out"); // blows up
    }
}
