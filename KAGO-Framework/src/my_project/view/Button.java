package my_project.view;

import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.model.ButtonUser;

import java.awt.event.MouseEvent;

public class Button extends InteractiveGraphicalObject {

    protected ButtonUser myUser;
    private String text;
    private double hoehe;
    protected int buttonNummer;

    public Button(int nummer, double x, double y, String text, int hoehe,  ButtonUser user){
        myUser = user;
        buttonNummer = nummer;
        this.x = x;
        this.y = y;
        this.text = text;
        this.hoehe = hoehe;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(255, 0, 0, 255);
        drawTool.formatText("Courier New", 0, (int)hoehe-2);
        drawTool.drawFilledRectangle(x, y, text.length()*(hoehe-2)*3/5+15, hoehe);
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawText(x+7.5, y+(hoehe-2)-8, text);
    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        double mouseX = e.getX();
        double mouseY = e.getY();
        if(mouseX > x && mouseX < x+text.length()*(hoehe-2)*3/5+15 && mouseY > y && mouseY < y+hoehe){
            myUser.reagiereAufButton(buttonNummer);
        }
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
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
}
