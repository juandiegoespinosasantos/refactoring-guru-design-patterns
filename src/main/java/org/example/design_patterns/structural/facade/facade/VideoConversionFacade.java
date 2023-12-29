package org.example.design_patterns.structural.facade.facade;

import java.io.File;
import org.example.design_patterns.structural.facade.some_complex_media_library.AudioMixer;
import org.example.design_patterns.structural.facade.some_complex_media_library.BitrateReader;
import org.example.design_patterns.structural.facade.some_complex_media_library.CodecFactory;
import org.example.design_patterns.structural.facade.some_complex_media_library.ICodec;
import org.example.design_patterns.structural.facade.some_complex_media_library.MPEG4CompressionCodec;
import org.example.design_patterns.structural.facade.some_complex_media_library.OggCompressionCodec;
import org.example.design_patterns.structural.facade.some_complex_media_library.VideoFile;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 28, 2023
 * @see <a href="https://refactoring.guru/design-patterns/facade">https://refactoring.guru/design-patterns/facade</a>
 * @since 17
 */
public class VideoConversionFacade {

    public File convertVideo(final String filename, final String format) {
        System.out.println("VideoConversionFacade: conversion started.");

        VideoFile videoFile = new VideoFile(filename);
        ICodec sourceCodec = CodecFactory.extract(videoFile);
        ICodec destinationCodec = (format.equals("mp4")) ? new MPEG4CompressionCodec() : new OggCompressionCodec();

        VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("VideoConversionFacade: conversion completed.");

        return result;
    }
}