package org.example.design_patterns.structural.proxy.proxy;

import java.util.HashMap;
import java.util.Map;
import org.example.design_patterns.structural.proxy.some_cool_media_library.IThirdPartyYouTubeLib;
import org.example.design_patterns.structural.proxy.some_cool_media_library.ThirdPartyYouTubeClass;
import org.example.design_patterns.structural.proxy.some_cool_media_library.Video;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 04, 2024
 * @see <a href="https://refactoring.guru/design-patterns/proxy">https://refactoring.guru/design-patterns/proxy</a>
 * @since 17
 */
public class YouTubeCacheProxy implements IThirdPartyYouTubeLib {

    private IThirdPartyYouTubeLib service;
    private Map<String, Video> cachePopular = new HashMap<>();
    private Map<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        service = new ThirdPartyYouTubeClass();
    }

    @Override
    public Map<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = service.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }

        return cachePopular;
    }

    @Override
    public Video getVideo(final String id) {
        Video video = cacheAll.get(id);

        if (video != null) {
            System.out.println("Retrieved video '" + id + "' from cache.");
        } else {
            video = service.getVideo(id);
            cacheAll.put(id, video);
        }

        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}