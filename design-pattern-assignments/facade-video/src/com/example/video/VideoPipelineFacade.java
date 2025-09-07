package com.example.video;

import java.nio.file.Path;

/** Facade for video processing pipeline. */
public class VideoPipelineFacade {
    /**
     * Processes a video file with optional filters and encodes output.
     * 
     * @param src             input file
     * @param out             output file
     * @param gray            apply grayscale if true
     * @param scale           scale factor (nullable)
     * @param sharpenStrength sharpen strength (nullable)
     * @return output file path
     */
    public static Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        Frame[] frames = dec.decode(src);
        if (gray) {
            frames = fe.grayscale(frames);
        }
        if (scale != null) {
            frames = fe.scale(frames, scale);
        }
        if (sharpenStrength != null) {
            SharpenAdapter adapter = new SharpenAdapter(new LegacySharpen());
            frames = adapter.sharpen(frames, sharpenStrength);
        }
        Path result = enc.encode(frames, out);
        return result;
    }
}