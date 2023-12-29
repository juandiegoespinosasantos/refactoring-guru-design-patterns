package org.example.design_patterns.structural.facade.some_complex_media_library;

import java.io.File;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 28, 2023
 * @see <a href="https://refactoring.guru/design-patterns/facade">https://refactoring.guru/design-patterns/facade</a>
 * @since 17
 */
public class AudioMixer {

    public File fix(final VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");

        return new File("tmp");
    }
}