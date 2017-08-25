package io.github.lucasepe.m3u;

import io.github.lucasepe.core.uri.Uri;
import io.github.lucasepe.m3u.models.Playlist;
import io.github.lucasepe.m3u.models.Segment;
import io.github.lucasepe.m3u.models.Stream;

import java.util.List;

public class Demo {

    public static void testPlayListFromHttp() throws Exception {
        Uri uri = Uri.parse("C:\\Users\\sepelu\\Projects\\Java\\Workspaces\\M3U\\src\\test\\resources\\correct.m3u8");
        //Uri uri = Uri.parse("https://raw.githubusercontent.com/grafov/m3u8/master/sample-playlists/wowza-vod-chunklist.m3u8");
        //Uri uri = Uri.parse("https://raw.githubusercontent.com/grafov/m3u8/master/sample-playlists/master-with-alternatives.m3u8");
        //Uri uri = Uri.parse("https://raw.githubusercontent.com/grafov/m3u8/master/sample-playlists/master-with-multiple-codecs.m3u8");
        //Uri uri = Uri.parse("https://raw.githubusercontent.com/grafov/m3u8/master/sample-playlists/widevine-bitrate.m3u8");
        //Uri uri = Uri.parse("https://raw.githubusercontent.com/grafov/m3u8/master/sample-playlists/master-with-stream-inf-name.m3u8");
        M3UParser parser = new M3UParser();
        Playlist playlist = parser.parse(uri);
        System.out.println(playlist);
        System.out.println();
        List<Stream> streams = playlist.getStreams();
        for (Stream stream: streams) {
            System.out.println(stream);
        }

        System.out.println();
        List<Segment> segments = playlist.getSegments();
        for (Segment segment: segments) {
            System.out.println(segment);
        }
    }

    public static void main(String[] args) throws Exception {
        Demo.testPlayListFromHttp();
    }
}
