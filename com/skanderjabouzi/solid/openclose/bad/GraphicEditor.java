package com.skanderjabouzi.solid.openclose.bad;

/**
 * Created by Skander Jabouzi on 7/3/17.
 */

// Open-Close Principle - Bad example
class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.m_type==1)
            drawRectangle((Rectangle) s);
        else if (s.m_type==2)
            drawCircle((Circle) s);
    }
    public void drawCircle(Circle r) {
        System.out.println("Draw Circle");
    }

    public void drawRectangle(Rectangle r) {
        System.out.println("Draw Rectangle");
    }
}