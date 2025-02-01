import downloader.YouTubeDownloader;
import proxy.YouTubeCacheProxy;
import some_cool_media_library.ThirdPartyYouTubeClass;

public class DemoProxy {
    public static void main(String[] args){
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("time saved by catching proxy" + (naive - smart) + "ms");

    }
    private static long test(YouTubeDownloader downloader){
        long startTime = System.currentTimeMillis();
        //user behavior
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideo");

        downloader.renderVideoPage("catzzzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("time elapsed : " + estimatedTime + "ms\n");
        return estimatedTime;
        }
    }

