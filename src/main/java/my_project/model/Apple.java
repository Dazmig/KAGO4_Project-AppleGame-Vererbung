package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Apple extends Fruit {

    //Attribute

    public Apple(double x, double y) {
        super(x, y);
        speed = 200;
        this.setNewImage("src/main/resources/graphic/Peach.png");

    }

}


