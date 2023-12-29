package org.example.design_patterns.structural.facade;

import org.example.design_patterns.structural.facade.facade.VideoConversionFacade;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Dec 28, 2023
 * @see <a href="https://refactoring.guru/design-patterns/facade">https://refactoring.guru/design-patterns/facade</a>
 * @since 17
 */
public class FacadeDemo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}