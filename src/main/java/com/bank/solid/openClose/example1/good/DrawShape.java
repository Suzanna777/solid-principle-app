package com.bank.solid.openClose.example1.good;

import java.util.List;

public class DrawShape {

    public void startDrawing(List<Shape> shapes) {

        for (Shape shape: shapes) {
            shape.draw();
        }

    }

}
