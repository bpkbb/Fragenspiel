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
        BinaryTree<Frage> rT = new BinaryTree<>();
        BinaryTree<Frage> lT = new BinaryTree<>();
        BinaryTree<Frage> fuenf03 = new BinaryTree<>();
        fuenf03.setLeftTree(lT);
        fuenf03.setRightTree(rT);
        BinaryTree<Frage> fuenf01 = new BinaryTree<>();
        BinaryTree<Frage> fuenf02 = new BinaryTree<>();
        BinaryTree<Frage> fuenf04 = new BinaryTree<>();
        BinaryTree<Frage> fuenf05 = new BinaryTree<>();
        BinaryTree<Frage> fuenf06 = new BinaryTree<>();

        BinaryTree<Frage> vier01 = new BinaryTree<>();
        vier01.setLeftTree(fuenf01);
        vier01.setRightTree(fuenf02);
        BinaryTree<Frage> vier02 = new BinaryTree<>();
        vier02.setLeftTree(fuenf03);
        vier02.setRightTree(fuenf04);
        BinaryTree<Frage> vier03 = new BinaryTree<>();
        BinaryTree<Frage> vier04 = new BinaryTree<>();
        BinaryTree<Frage> vier05 = new BinaryTree<>();
        BinaryTree<Frage> vier06 = new BinaryTree<>();
        vier06.setLeftTree(fuenf05);
        vier06.setRightTree(fuenf06);

        BinaryTree<Frage> drei01 = new BinaryTree<>();
        drei01.setLeftTree(vier01);
        drei01.setRightTree(vier02);
        BinaryTree<Frage> drei02 = new BinaryTree<>();
        drei02.setLeftTree(vier03);
        drei02.setRightTree(vier04);
        BinaryTree<Frage> drei03 = new BinaryTree<>();
        BinaryTree<Frage> drei04 = new BinaryTree<>();
        drei04.setLeftTree(vier05);
        drei04.setRightTree(vier06);

        BinaryTree<Frage> zwei01 = new BinaryTree<>();
        zwei01.setLeftTree(drei01);
        zwei01.setRightTree(drei02);
        BinaryTree<Frage> zwei02 = new BinaryTree<>();
        BinaryTree<Frage> zwei03 = new BinaryTree<>();
        BinaryTree<Frage> zwei04 = new BinaryTree<>();
        zwei04.setLeftTree(drei03);
        zwei04.setRightTree(drei04);

        BinaryTree<Frage> eins01 = new BinaryTree<>();
        eins01.setLeftTree(zwei01);
        eins01.setRightTree(zwei02);
        BinaryTree<Frage> eins02 = new BinaryTree<>();
        eins02.setLeftTree(zwei03);
        eins02.setRightTree(zwei04);

        fragen.setLeftTree(eins01);
        fragen.setRightTree(eins02);
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
