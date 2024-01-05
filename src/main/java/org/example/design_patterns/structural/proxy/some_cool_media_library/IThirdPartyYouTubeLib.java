package org.example.design_patterns.structural.proxy.some_cool_media_library;

import java.util.Map;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 04, 2024
 * @see <a href="https://refactoring.guru/design-patterns/proxy">https://refactoring.guru/design-patterns/proxy</a>
 * @since 17
 */
public interface IThirdPartyYouTubeLib {

    Map<String, Video> popularVideos();

    Video getVideo(String id);
}