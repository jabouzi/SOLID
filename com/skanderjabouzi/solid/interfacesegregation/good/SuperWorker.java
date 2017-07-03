package com.skanderjabouzi.solid.interfacesegregation.good;

public class SuperWorker implements IWorker {

    public void work() {
        System.out.println("Worker working much more");
    }

    public void eat() {
        System.out.println("Worker eating much more in launch break");
    }
}