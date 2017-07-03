package com.skanderjabouzi.solid;

import com.skanderjabouzi.solid.openclose.good.*;
import com.skanderjabouzi.solid.dependencyinversion.good.*;
import com.skanderjabouzi.solid.interfacesegregation.good.*;

public class Main {

    public static void main(String[] args) {

        //open close
        Rectangle r = new Rectangle();
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(r);

        Circle c = new Circle();
        ge.drawShape(c);

        System.out.println("============");

        //dependency inversion
        com.skanderjabouzi.solid.dependencyinversion.good.Worker w = new com.skanderjabouzi.solid.dependencyinversion.good.Worker();
        com.skanderjabouzi.solid.dependencyinversion.good.SuperWorker sw = new com.skanderjabouzi.solid.dependencyinversion.good.SuperWorker();
        com.skanderjabouzi.solid.dependencyinversion.good.Manager m = new com.skanderjabouzi.solid.dependencyinversion.good.Manager();
        m.setWorker(w);
        m.manage();
        m.setWorker(sw);
        m.manage();

        System.out.println("============");

        //interface segregation
        com.skanderjabouzi.solid.interfacesegregation.good.Worker w2 = new com.skanderjabouzi.solid.interfacesegregation.good.Worker();
        com.skanderjabouzi.solid.interfacesegregation.good.SuperWorker sw2 = new com.skanderjabouzi.solid.interfacesegregation.good.SuperWorker();
        com.skanderjabouzi.solid.interfacesegregation.good.Robot rbt = new com.skanderjabouzi.solid.interfacesegregation.good.Robot();
        com.skanderjabouzi.solid.interfacesegregation.good.Manager m2 = new com.skanderjabouzi.solid.interfacesegregation.good.Manager();
        m2.setWorker(w2);
        m2.manage();
        m2.setWorker(sw2);
        m2.manage();
        m2.setWorker(rbt);
        m2.manage();
    }
}
