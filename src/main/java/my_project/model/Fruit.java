package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public abstract class Fruit extends GraphicalObject {
    protected double speed;
        protected double value;

    public Fruit(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.drawImage(this.getMyImage(),x,y);
        /*drawTool.setCurrentColor(new Color(0x076F00));
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y,width,height);*/
    }

    @Override
    public void update(double dt) {

        setValue(f.value){
            f.value = value;
        }

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