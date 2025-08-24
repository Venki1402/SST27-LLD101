public class Player {
    Cache cache;
    DrawUI dui;
    private Frame last;

    Player(DrawUI dui, Cache cache) {
        this.dui = dui;
        this.cache = cache;
    }

    void play(byte[] fileBytes) {
        // decode
        Frame f = new Frame(fileBytes); // pretend decoding
        last = f;

        // draw UI
        // System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        dui.draw(fileBytes.length);

        // cache
        // System.out.println("Cached last frame? " + (last != null));
        cache.save(last);
    }
}