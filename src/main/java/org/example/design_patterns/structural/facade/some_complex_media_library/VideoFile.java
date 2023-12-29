package org.example.design_patterns.structural.facade.some_complex_media_library;

import lombok.Getter;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 28, 2023
 * @see <a href="https://refactoring.guru/design-patterns/facade">https://refactoring.guru/design-patterns/facade</a>
 * @since 17
 */
@Getter
public class VideoFile {

    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.lastIndexOf(".") + 1);
    }
}