package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Apple extends Fruit {

    //Attribute
    private double speed;

    public Apple(double x, double y){

        speed = 200;
        this.setNewImage("src/main/resources/graphic/Peach.png");

    }




    @Override
    public void update(double dt) {
        y = y + speed * dt;
        if (y >= 1030) {
        jumpBack();
    }
        //TODO 01 Ein Apfel soll von oben herab fallen. Sobald er unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 02).
    }
        public void jumpBack() {
            x = 30+Math.random()*740;
            y = -30;
        }
    //TODO 02 Lege eine Methode jumpBack() an, die bei Aufruf das Apple-Objekt oben am oberen Bildschirmrand an einer zufälligen x-Position positioniert.
}
