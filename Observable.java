package com.company.observable;

import com.company.obs.Observer;

public interface Observable {
    void add(Observer observer);

     void update();

    void remove(Observer observer);

    void notifyObserver();
}
