package my_project.view;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.GameControll;
import my_project.model.ButtonUser;

import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class Startbildschirm extends GraphicalObject implements ButtonUser {

    private BufferedImage starttext;
    private StartHintergrund sH;
    private Button startButton;
    private GameControll gC;
    private ViewController vC;

    public Startbildschirm(GameControll gameControll, ViewController viewController, BufferedImage bild) {
        vC = viewController;
        starttext = bild;
        sH = new StartHintergrund();
        vC.draw(sH, 0);
        gC = gameControll;
        startButton = new Button(0,300,300,"Lasse das Spiel beginnen", 30, this);
        vC.draw(startButton, 0);
        vC.register(startButton, 0);
    }

    /*
    Bei klicken des Knopfes wird das eigentliche Spiel gestartet.
     */
    @Override
    public void reagiereAufButton(int buttonNummer) {
        gC.setScene(1);
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.drawImage(starttext,0,0);
    }

    @Override
    public void update(double dt) {

    }
}
