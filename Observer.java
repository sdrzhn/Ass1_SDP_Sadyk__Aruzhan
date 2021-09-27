package com.company.obs;

public interface Observer {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();

    void update();
}
