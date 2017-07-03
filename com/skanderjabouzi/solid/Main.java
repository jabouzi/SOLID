package com.skanderjabouzi.solid;

import com.skanderjabouzi.solid.openclose.good.*;
import com.skanderjabouzi.solid.dependencyinversion.good.*;

public class Main {

    public static void main(String[] args) {

        //open close
        Rectangle r = new Rectangle();
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(r);

        Circle c = new Circle();
        ge.drawShape(c);

        //dependency inversion
        Worker w = new Worker();
        SuperWorker sw = new SuperWorker();

        Manager m = new Manager();
        m.setWorker(w);
        m.manage();
        m.setWorker(sw);
        m.manage();
    }
}
