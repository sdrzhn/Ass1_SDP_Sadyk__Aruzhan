package com.company.obs;
import com.company.observable.IAccount;
import com.company.obs.Observer;
import com.company.retrurn.Video;

public class Follower implements Observer{
    private int f_id;
    private IAccount nickname;

    public Follower(int f_id, IAccount nickname){
        this.f_id=f_id;
        this.nickname = nickname;
    }

    @Override
    public void add(Observer observer) {

    }

    @Override
    public void remove(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public void update(){
        Video newVideo = nickname.getVideo();
        System.out.println(f_id + "publish New video" + newVideo);
    }


}
