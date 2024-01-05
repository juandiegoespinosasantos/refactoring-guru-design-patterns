package org.example.design_patterns.structural.proxy.some_cool_media_library;

import lombok.Data;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 04, 2024
 * @see <a href="https://refactoring.guru/design-patterns/proxy">https://refactoring.guru/design-patterns/proxy</a>
 * @since 17
 */
@Data
public class Video {

    private String id;
    private String title;
    private String data;

    public Video(String id, String title) {
        this.id = id;
        this.title = title;
        data = "Random video.";
    }
}