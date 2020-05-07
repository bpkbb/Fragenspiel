package my_project.view;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class StartHintergrund extends GraphicalObject {
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawFilledRectangle(0,0,1000,700);
    }

    @Override
    public void update(double dt) {

    }
}
