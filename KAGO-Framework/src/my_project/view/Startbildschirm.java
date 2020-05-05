package my_project.view;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.GameControll;
import my_project.model.ButtonUser;

import java.awt.event.MouseEvent;

public class Startbildschirm extends InteractiveGraphicalObject implements ButtonUser {

    private String starttext;
    private Button startButton;
    private GameControll gC;

    public Startbildschirm(GameControll gameControll) {
        starttext = "....";
        gC = gameControll;
        startButton = new Button(0,300,300,"Lasse das Spiel beginnen", 30, this);
    }

    /*
    Bei klicken des Knopfes wird das eigentliche Spiel gestartet.
     */
    @Override
    public void reagiereAufButton(int buttonNummer) {
        gC.setNextScene();
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.drawFilledRectangle(0,0,1000,700);
    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void keyPressed(int key) {

    }

    @Override
    public void keyReleased(int key) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }


}
