package org.example.design_patterns.structural.facade.some_complex_media_library;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 28, 2023
 * @see <a href="https://refactoring.guru/design-patterns/facade">https://refactoring.guru/design-patterns/facade</a>
 * @since 17
 */
public final class BitrateReader {

    private BitrateReader() {
    }

    public static VideoFile read(final VideoFile file, final ICodec codec) {
        System.out.println("BitrateReader: reading file...");

        return file;
    }

    public static VideoFile convert(final VideoFile buffer, final ICodec codec) {
        System.out.println("BitrateReader: writing file...");

        return buffer;
    }
}