public class BasicPrinter implements Printable {
    @Override
    public void print(String text) {
        System.out.println("Print: " + text);
    }

    // public void scan(String dstPath) {
    // throw new UnsupportedOperationException();
    // }

    // public void fax(String number) {
    // throw new UnsupportedOperationException();
    // }
}
