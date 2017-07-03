package com.skanderjabouzi.solid.openclose.good;
/**
 * Created by Skander Jabouzi on 7/3/17.
 */

// Open-Close Principle - Good example
public class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}