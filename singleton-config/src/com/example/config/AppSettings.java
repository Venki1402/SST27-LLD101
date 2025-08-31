package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance
 * each time,
 * not thread-safe, reload allowed anytime, mutable global state,
 * reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private final Properties props = new Properties();
    private static final long serialVersionUID = 1L;
    static AppSettings original;

    // should not be public for true singleton
    private AppSettings() {
    }

    private Object readResolve() {
        return getInstance();
    }

    // returns a fresh instance (bug)
    public static synchronized AppSettings getInstance() {
        if (original == null) {
            original = new AppSettings();
        }
        return original;
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
