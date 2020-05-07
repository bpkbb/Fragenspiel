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
        startbildschirm = new Startbildschirm(this, vC);
        vC.draw(startbildschirm, 0);
        spielansicht = new Spielansicht(this, vC);
        vC.draw(spielansicht, 1);
        endbildschirm = new Endbildschirm(this, vC);
        vC.draw(endbildschirm, 2);
        erstelleDenBaum();
    }



    private void erstelleDenBaum(){
        fragen = new BinaryTree<>();
        fragen.setContent(new Frage("Wohin läuft er?","Er geht in den Norden",0,"Er geht in den Osten",0,"Er geht in den Süden",1,"Er geht in den Westen",1));

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
        vier01.setContent(new Frage("In der Großstadt angekommen, begegnen ihm Banditen. Was macht er?","Mit Schnick, Schnack, Schnuck duellieren",0,"Verzweifelt schreien und Leute damit anlocken",0,"Kämpfe",1,"Wegrennen",1));
        vier01.setLeftTree(fuenf01);
        vier01.setRightTree(fuenf02);
        BinaryTree<Frage> vier02 = new BinaryTree<>();
        vier02.setContent(new Frage("Noch hat er nicht gefunden. Was macht er?","Nach einem Fluss suchen",0,"Weiter nach Beeren suchen",0,"Weiterhin jagen",1,"Aufgeben",1));
        vier02.setLeftTree(fuenf03);
        vier02.setRightTree(fuenf04);
        BinaryTree<Frage> vier03 = new BinaryTree<>();
        vier03.setContent(new Frage("Sein Fuß ermordete ihn.","",0,"",0,"",1,"",1));
        BinaryTree<Frage> vier04 = new BinaryTree<>();
        vier04.setContent(new Frage("Er ist geheilt und lebt mit dem Drachen ihm Wald.","",0,"",0,"",1,"",1));
        BinaryTree<Frage> vier05 = new BinaryTree<>();
        vier05.setContent(new Frage("Die Polizei hat ihn erschossen!","",0,"",0,"",1,"",1));
        BinaryTree<Frage> vier06 = new BinaryTree<>();
        vier06.setContent(new Frage("Er ist entkommen. Was macht er?","",0,"",0,"",1,"",1));
        vier06.setLeftTree(fuenf05);
        vier06.setRightTree(fuenf06);

        BinaryTree<Frage> drei01 = new BinaryTree<>();
        drei01.setContent(new Frage("Der Drache kriegt Hunger. Was ist sein nächster Schritt?","In die Stadt gehen",0,"Weiter nach Norden gehen",0,"Nach Beeren suchen",1,"Jagen gehen!",1));
        drei01.setLeftTree(vier01);
        drei01.setRightTree(vier02);
        BinaryTree<Frage> drei02 = new BinaryTree<>();
        drei02.setContent(new Frage("Sein Fuß entzündet sich. Was sollte er tun?","Er läuft weiter.",0,"Er rennt und schreit um Hilfe",0,"Er ruht sich aus",1,"Weiter nach Pflanzen suchen",1));
        drei02.setLeftTree(vier03);
        drei02.setRightTree(vier04);
        BinaryTree<Frage> drei03 = new BinaryTree<>();
        drei03.setContent(new Frage("Seine Gesundheit sank und damit endete sein Leben.","",0,"",0,"",1,"",1));
        BinaryTree<Frage> drei04 = new BinaryTree<>();
        drei04.setContent(new Frage("Die Polizei ist vor dir. Deine Drache ist in Gefahr! Was nun?","Weitermachen",0,"Kopflos zur Baustelle rennen",0,"Er soll sich in der Gasse verstecken",1,"Ganz normal verhalten",1));
        drei04.setLeftTree(vier05);
        drei04.setRightTree(vier06);

        BinaryTree<Frage> zwei01 = new BinaryTree<>();
        zwei01.setContent(new Frage("Er ist verletzt. Was machst er?","Verstecke dich!",0,"Er macht Pause",0,"Suche nach heilenden Pflanzen",1,"Er soll weiterlaufen. Er ist doch keine Memme!",1));
        zwei01.setLeftTree(drei01);
        zwei01.setRightTree(drei02);
        BinaryTree<Frage> zwei02 = new BinaryTree<>();
        zwei02.setContent(new Frage("Der Bär hat ihn getötet! Das war sein Ende...","",0,"",0,"",1,"",1));
        BinaryTree<Frage> zwei03 = new BinaryTree<>();
        zwei03.setContent(new Frage("Er ist tot!","",0,"",0,"",1,"",1));
        BinaryTree<Frage> zwei04 = new BinaryTree<>();
        zwei04.setContent(new Frage("Sein Magen knurrt. Was soll er machen?","Nichts essen. Er macht jetzt Diät.",0,"Die Reste um ihn herum essen.",0,"Essen aus dem Supermarkt klauen",1,"Essen von Menschen klauen",1));
        zwei04.setLeftTree(drei03);
        zwei04.setRightTree(drei04);

        BinaryTree<Frage> eins01 = new BinaryTree<>();
        eins01.setContent(new Frage("Plötzlich begegnet ihm ein Bär! Was soll er tun?","Er soll wegrennen!",0,"Den Drachen befehlen anzugreifen",0,"Er nimmt einen Stein und versucht ihn zu erschlagen!",1,"Er kämpft gegen ihn!",1));
        eins01.setLeftTree(zwei01);
        eins01.setRightTree(zwei02);
        BinaryTree<Frage> eins02 = new BinaryTree<>();
        eins02.setContent(new Frage("Er landet in der Großstadt. Er sollte sich verstecken, aber wo?","In einer Bar!",0,"In einem verlassenen Haus",0,"In einer Gasse",1,"Auf einer Müllhalde",1));
        eins02.setLeftTree(zwei03);
        eins02.setRightTree(zwei04);

        fragen.setLeftTree(eins01);
        fragen.setRightTree(eins02);
    }

    public Frage getAktuelleFrage(){
        return aktuelleFrage.getContent();
    }

    /**
     * Setzt den Spielfluss fort indem die nächste bzw. resultoerende Frage aufgerufen wird.
     * @param a ist die gewählte Antwort.
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

    public void setScene(int i){
        vC.showScene(i);
    }
}
