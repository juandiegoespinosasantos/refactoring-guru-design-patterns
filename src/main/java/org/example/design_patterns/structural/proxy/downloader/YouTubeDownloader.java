package org.example.design_patterns.structural.proxy.downloader;

import lombok.AllArgsConstructor;
import org.example.design_patterns.structural.proxy.some_cool_media_library.IThirdPartyYouTubeLib;
import org.example.design_patterns.structural.proxy.some_cool_media_library.Video;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 04, 2024
 * @see <a href="https://refactoring.guru/design-patterns/proxy">https://refactoring.guru/design-patterns/proxy</a>
 * @since 17
 */
@AllArgsConstructor
public class YouTubeDownloader {

    private IThirdPartyYouTubeLib api;

    public void renderVideoPage(final String id) {
        Video video = api.getVideo(id);

        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");

        for (Video video : api.popularVideos().values()) {
            System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
        }

        System.out.println("-------------------------------\n");
    }
}