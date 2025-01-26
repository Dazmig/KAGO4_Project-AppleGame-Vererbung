package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Pear extends Fruit {

    //Attribute

    public Pear(double x, double y) {
        super(x, y);
        value = 3;
        speed = 150;
        this.setNewImage("src/main/resources/graphic/Strawberry.png");
    }

}





