package org.example.design_patterns.structural.proxy.some_cool_media_library;

import java.util.HashMap;
import java.util.Map;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 04, 2024
 * @see <a href="https://refactoring.guru/design-patterns/proxy">https://refactoring.guru/design-patterns/proxy</a>
 * @since 17
 */
public class ThirdPartyYouTubeClass implements IThirdPartyYouTubeLib {

    @Override
    public Map<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");

        return getRandomVideos();
    }

    @Override
    public Video getVideo(String id) {
        connectToServer("http://www.youtube.com/" + id);

        return getSomeVideo(id);
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);

        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(final String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private Map<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();

        Map<String, Video> resp = new HashMap<>();
        resp.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        resp.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        resp.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        resp.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        resp.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.println("Done!");

        return resp;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");

        return video;
    }
}