//package com.stackroute.Muzix.feedcomponent;
//
//import com.stackroute.Muzix.domain.Track;
//import com.stackroute.Muzix.service.TrackService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//
//public class FeedApplicationRunner implements ApplicationRunner {
//
//    private Track feedTrackData = new Track();
//    @Value("${song.1.id}")
//    private int id1;
//    @Value("${song.1.name}")
//    private String name1;
//    @Value("${song.1.comment}")
//    private String comment1;
//    @Value("${song.2.id}")
//    private int id2;
//    @Value("${song.2.name}")
//    private String name2;
//    @Value("${song.2.comment}")
//    private String comment2;
//    @Value("${song.3.id}")
//    private int id3;
//    @Value("${song.3.name}")
//    private String name3;
//    @Value("${song.3.comment}")
//    private String comment3;
//
//    @Autowired
//    private TrackService trackServices;
//
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//
//
//         feedTrackData.setTrackId(Integer.parseInt(env.getProperty("song.1.id")));
//         feedTrackData.setName(env.getProperty("song1.name"));
//         feedTrackData.setComment(env.getProperty("song.1.comment"));
//         trackServices.addTrack(feedTrackData);
//        feedTrackData.setTrackId(id2);
//        feedTrackData.setTrackName(name2);
//        feedTrackData.setComment(comment2);
//        trackServices.saveTrack(feedTrackData);
//
//        feedTrackData.setTrackId(id2);
//        feedTrackData.setTrackName(name2);
//        feedTrackData.setComment(comment2);
//        trackServices.saveTrack(feedTrackData);
//
//
//    }
//}
