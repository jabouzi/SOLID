package com.skanderjabouzi.solid.interfacesegregation.bad;

class Manager {

    Worker worker;

    public void setWorker(Worker w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }
}
