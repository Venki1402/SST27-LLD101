package com.example.render;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TextStyleFactory {
    private static final Map<String, TextStyle> cache = new ConcurrentHashMap<>();

    public static TextStyle get(String font, int size, boolean bold) {
        String key = font + "|" + size + "|" + (bold ? "B" : "N");
        return cache.computeIfAbsent(key, k -> {
            String[] parts = k.split("\\|");
            String f = parts[0];
            int s = Integer.parseInt(parts[1]);
            boolean b = "B".equals(parts[2]);
            return new TextStyle(f, s, b);
        });
    }
}