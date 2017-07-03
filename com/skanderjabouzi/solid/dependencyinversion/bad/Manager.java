package com.skanderjabouzi.solid.dependencyinversion.bad;

class Manager {

    Worker worker;

    public void setWorker(Worker w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }
}
