package com.example.video;

/** Adapter to use LegacySharpen with Frame[] API. */
public class SharpenAdapter {
    private final LegacySharpen legacy;

    public SharpenAdapter(LegacySharpen legacy) {
        this.legacy = legacy;
    }

    /**
     * Applies sharpen to frames using the legacy API.
     * 
     * @param frames   input frames
     * @param strength sharpen strength
     * @return new frames (simulated, returns same frames for demo)
     */
    public Frame[] sharpen(Frame[] frames, int strength) {
        String handle = framesToHandle(frames);
        String newHandle = legacy.applySharpen(handle, strength);
        return handleToFrames(newHandle, frames);
    }

    private String framesToHandle(Frame[] frames) {
        return "HANDLE:" + frames.length;
    }

    private Frame[] handleToFrames(String handle, Frame[] origFrames) {
        return origFrames;
    }
}