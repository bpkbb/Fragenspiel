package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.BinaryTree;
import my_project.model.Antwort;
import my_project.model.Frage;
import my_project.view.Endbildschirm;
import my_project.view.Spielansicht;
import my_project.view.Startbildschirm;

public class GameControll {
    private ViewController vC;
    private BinaryTree<Frage> fragen;
    private BinaryTree<Frage> aktuelleFrage;
    private Startbildschirm startbildschirm;
    private Spielansicht spielansicht;
    private Endbildschirm endbildschirm;

    public GameControll(ViewController vC) {
        this.vC = vC;
        starteDasSpiel();
    }

    private void starteDasSpiel(){
        vC.createScene();
        vC.createScene();
        vC.createScene();
        startbildschirm = new Startbildschirm(this);
        vC.draw(startbildschirm, 0);
        vC.register(startbildschirm, 0);
        spielansicht = new Spielansicht();
        vC.draw(spielansicht, 1);
        vC.register(spielansicht, 1);
        endbildschirm = new Endbildschirm();
        vC.draw(endbildschirm, 2);
        vC.register(endbildschirm, 2);
        erstelleDenBaum();
    }

    private void erstelleDenBaum(){
        fragen = new BinaryTree<>();
        //fragen.setContent(new Frage());
        //Hier müssen alle Fragen ergänzt werden.
    }

    public Frage getAktuelleFrage(){
        return aktuelleFrage.getContent();
    }

    /*Setzt den Spielfluss fort indem die nächste bzw. resultoerende Frage aufgerufen wird.
    @param a ist die gewählte Antwort.
     */

    public void naechsteFrage(Antwort a){
        if(a.getFolgeBaum() == 0){
            aktuelleFrage = aktuelleFrage.getLeftTree();
        }else{
            aktuelleFrage = aktuelleFrage.getRightTree();
        }
        if(aktuelleFrage.getLeftTree().isEmpty() && aktuelleFrage.getRightTree().isEmpty()){
            vC.showScene(2);
        }
    }

    public void setNextScene(){

    }
}
