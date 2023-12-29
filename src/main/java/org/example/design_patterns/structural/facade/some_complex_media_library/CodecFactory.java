package org.example.design_patterns.structural.facade.some_complex_media_library;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 28, 2023
 * @see <a href="https://refactoring.guru/design-patterns/facade">https://refactoring.guru/design-patterns/facade</a>
 * @since 17
 */
public final class CodecFactory {

    private CodecFactory() {
    }

    public static ICodec extract(final VideoFile file) {
        String codecType = file.getCodecType();

        if (codecType.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");

            return new MPEG4CompressionCodec();
        }

        System.out.println("CodecFactory: extracting ogg audio...");

        return new OggCompressionCodec();
    }
}