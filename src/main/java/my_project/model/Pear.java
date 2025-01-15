package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Pear extends Fruit {

    //Attribute
    private double speed;

    public Pear(double x, double y){

        speed = 150;
        this.setNewImage("src/main/resources/graphic/Strawberry.png");
    }



    @Override
    public void update(double dt) {
        y = y + speed*dt;
        if (y >= 1030) {
            jumpBack();
        }

        //TODO 03 Eine Birne soll von oben herab fallen. Sobald sie unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 04).
    }

    public void jumpBack(){
        y = -30;
        x = 30+Math.random()*740;
    }
    //TODO 04 Lege eine Methode jumpBack() an, die bei Aufruf das Pear-Objekt oben am oberen Bildschirmrand an einer zufälligen x-Position positioniert.
}

