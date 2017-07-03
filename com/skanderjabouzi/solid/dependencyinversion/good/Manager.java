package com.skanderjabouzi.solid.dependencyinversion.good;

public class Manager {
    IWorker worker;

    public void setWorker(IWorker w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }
}

