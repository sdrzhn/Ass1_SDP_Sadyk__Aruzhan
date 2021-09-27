package com.company.observable;

import com.company.retrurn.Video;
import com.company.obs.Observer;

import java.util.ArrayList;
import java.util.List;

public class IAccount implements Observable {
    private List<Video> videos;
    private List<Observer> follower;
    private List<Video> Videos;

    public IAccount() {
        this.videos = new ArrayList<Video>();
        this.follower = new ArrayList<>();
        this.Videos = new ArrayList<>() ;
    }

    @Override
    public void add(Observer observer){
        add(observer);
    }

    @Override
    public void update() {

    }

    @Override
    public void remove(Observer observer)
    {
         remove(observer);
    }

    @Override
    public void notifyObserver(){
        for (Video observer: videos) {
            update();
        }
    }

    public void publishNewVideo(Video video){
        videos.add(video);
        notifyObserver();
    }

    public Video getVideo(){
        int last = videos.size() -1;
        return videos.get(last);
    }

}
