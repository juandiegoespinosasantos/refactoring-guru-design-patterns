package org.example.design_patterns.structural.proxy;

import org.example.design_patterns.structural.proxy.downloader.YouTubeDownloader;
import org.example.design_patterns.structural.proxy.proxy.YouTubeCacheProxy;
import org.example.design_patterns.structural.proxy.some_cool_media_library.ThirdPartyYouTubeClass;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 04, 2024
 * @see <a href="https://refactoring.guru/design-patterns/proxy">https://refactoring.guru/design-patterns/proxy</a>
 * @since 17
 */
public class ProxyDemo {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        long naive = test(naiveDownloader);

        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());
        long smart = test(smartDownloader);

        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(final YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;

        System.out.print("Time elapsed: " + estimatedTime + "ms\n");

        return estimatedTime;
    }
}