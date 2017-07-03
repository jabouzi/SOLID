package com.skanderjabouzi.solid;

import com.skanderjabouzi.solid.openclose.good.*;

public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(r);

        Circle c = new Circle();
        ge.drawShape(c);
    }
}
