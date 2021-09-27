package com.company;

import com.company.observable.IAccount;
import com.company.obs.Follower;
import com.company.retrurn.Video;

public class Main {
    public static void main(String[] args){
        IAccount nickname = new IAccount();
        Follower follower1 = new Follower(1, nickname);
        Follower follower2 = new Follower(2, nickname);

        Video newVideo = new Video("instagram/sdrzhn/video/#myfirstcode", "MyFirstCode");
        nickname.publishNewVideo(newVideo);
    }
}
