public class Demo08 {
    public static void main(String[] args) {
        PedalI v = new Bicycle();
        v.pedal(50);
        // v.startEngine(); // crash
    }
}
