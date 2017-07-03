package com.skanderjabouzi.solid.interfacesegregation.good;

public class Worker implements IWorker {

    public void work() {
        System.out.println("Worker Working");
    }

    public void eat() {
        System.out.println("Worker eating in launch break");
    }

}