package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Fruit extends GraphicalObject {

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.drawImage(this.getMyImage(),x,y);
        /*drawTool.setCurrentColor(new Color(0x076F00));
        drawTool.drawFilledRectangle(x,y,width,height);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y,width,height);*/
    }

}