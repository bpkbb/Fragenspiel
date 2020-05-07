package my_project.view;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.GameControll;
import my_project.model.ButtonUser;

import java.awt.event.MouseEvent;

public class Endbildschirm extends GraphicalObject implements ButtonUser {

    private GameControll gC;
    private ViewController vC;
    private Button wiederholungsButton;

    public Endbildschirm(GameControll gC, ViewController vC) {
        this.gC = gC;
        this.vC = vC;
        wiederholungsButton = new Button(0, 150, 150, "Try it again", 60, this);
    }

    @Override
    public void draw(DrawTool drawTool) {

    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void reagiereAufButton(int buttonNummer) {
        gC.setScene(0);
    }
}
