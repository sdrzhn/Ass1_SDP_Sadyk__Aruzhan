package com.company.retrurn;

import com.company.obs.Observer;
import com.company.observable.Observable;

public class Video implements Observable {
    private String video_link;
    private String video;

    public Video(String video_link, String video){
        this.video_link=video_link;
        this.video=video;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }


    public String getVideo_link() {
        return video_link;
    }

    public void setVideo_link(String video_link) {
        this.video_link = video_link;
    }

    @Override
    public void add(Observer observer) {

    }

    @Override
    public void update() {

    }

    @Override
    public void remove(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
