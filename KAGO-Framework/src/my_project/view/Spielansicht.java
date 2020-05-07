package my_project.view;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.GameControll;
import my_project.model.Antwort;
import my_project.model.ButtonUser;

import java.awt.event.MouseEvent;

public class Spielansicht extends GraphicalObject implements ButtonUser {

    private Button[] antwortenButtons;
    private GameControll gC;
    private ViewController vC;
    private Antwort[] antworten;
    private String aktuelleFrage;

    public Spielansicht(GameControll gameControll, ViewController viewController) {
        antwortenButtons = new Button[4];
        antworten = new Antwort[4];
        gC = gameControll;
        vC = viewController;
        setzteErsteFrage();
    }

    @Override
    public void reagiereAufButton(int buttonNummer) {
        gC.naechsteFrage(antworten[buttonNummer]);
        aktualisiereFragenWerte();
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.drawText(20,40,aktuelleFrage);
    }

    @Override
    public void update(double dt) {

    }

    private void setzteErsteFrage(){
        antworten = gC.getAktuelleFrage().getAntworten();
        aktuelleFrage = gC.getAktuelleFrage().getText();
        for(int i = 0; i < antwortenButtons.length; i++){
            antwortenButtons[i] = new Button(i, 0, 300+i*40, antworten[i].getAntwortText(), 40, this);
            vC.draw(antwortenButtons[i], 1);
            vC.register(antwortenButtons[i], 1);
        }
    }

    public void aktualisiereFragenWerte(){
        antworten = gC.getAktuelleFrage().getAntworten();
        for(int i = 0; i < antwortenButtons.length; i++){
            antwortenButtons[i].aktulisiereAnzeige(antworten[i].getAntwortText());
        }
        aktuelleFrage = gC.getAktuelleFrage().getText();
    }
}
