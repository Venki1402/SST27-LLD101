public class Demo02 {
    public static void main(String[] args) {
        DrawUI dui = new DrawUI();
        Cache cache = new Cache();
        Player p = new Player(dui, cache);
        p.play(new byte[] { 1, 2, 3, 4 });
    }
}
