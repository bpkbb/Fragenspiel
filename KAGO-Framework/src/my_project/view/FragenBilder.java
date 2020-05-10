package my_project.view;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.GameControll;

import java.awt.image.BufferedImage;

public class FragenBilder extends GraphicalObject {

    private GameControll gC;
    private BufferedImage eins01,eins02,zwei01,zwei02,zwei03,zwei04,drei01,drei02,drei03,drei04,vier01,vier02,vier03,
            vier04,vier05,vier06,fuenf01,fuenf02,fuenf03,fuenf04,fuenf05,fuenf06,lT,rT,wurzel,anfang;

    public FragenBilder(GameControll gameControll){
        gC = gameControll;
        eins01 = createImage("KAGO-Framework/assets/images/eins01.png");
        eins02 = createImage("KAGO-Framework/assets/images/eins02.png");
        zwei01 = createImage("KAGO-Framework/assets/images/zwei01.png");
        zwei02 = createImage("KAGO-Framework/assets/images/zwei03.png");
        zwei03 = createImage("KAGO-Framework/assets/images/zwei03.png");
        zwei04 = createImage("KAGO-Framework/assets/images/zwei04.png");
        drei01 = createImage("KAGO-Framework/assets/images/drei01.png");
        drei02 = createImage("KAGO-Framework/assets/images/drei02.png");
        drei03 = createImage("KAGO-Framework/assets/images/drei03.png");
        drei04 = createImage("KAGO-Framework/assets/images/drei04.png");
        vier01 = createImage("KAGO-Framework/assets/images/vier01.png");
        vier02 = createImage("KAGO-Framework/assets/images/vier02.png");
        vier03 = createImage("KAGO-Framework/assets/images/vier03.png");
        vier04 = createImage("KAGO-Framework/assets/images/vier04.png");
        vier05 = createImage("KAGO-Framework/assets/images/vier05.png");
        vier06 = createImage("KAGO-Framework/assets/images/vier06.png");
        fuenf01 = createImage("KAGO-Framework/assets/images/fuenf01.png");
        fuenf02 = createImage("KAGO-Framework/assets/images/fuenf02.png");
        fuenf03 = createImage("KAGO-Framework/assets/images/fuenf03.png");
        fuenf04 = createImage("KAGO-Framework/assets/images/fuenf04.png");
        fuenf05 = createImage("KAGO-Framework/assets/images/fuenf05.png");
        fuenf06 = createImage("KAGO-Framework/assets/images/fuenf06.png");
        lT = createImage("KAGO-Framework/assets/images/lT.png");
        rT = createImage("KAGO-Framework/assets/images/rT.png");
        wurzel = createImage("KAGO-Framework/assets/images/wurzel.png");
        anfang = createImage("KAGO-Framework/assets/images/anfangsText.png");
    }

    @Override
    public void draw(DrawTool drawTool) {

    }

    @Override
    public void update(double dt) {

    }

    public BufferedImage getEins01() {
        return eins01;
    }

    public BufferedImage getEins02() {
        return eins02;
    }

    public BufferedImage getZwei01() {
        return zwei01;
    }

    public BufferedImage getZwei02() {
        return zwei02;
    }

    public BufferedImage getZwei03() {
        return zwei03;
    }

    public BufferedImage getZwei04() {
        return zwei04;
    }

    public BufferedImage getDrei01() {
        return drei01;
    }

    public BufferedImage getDrei02() {
        return drei02;
    }

    public BufferedImage getDrei03() {
        return drei03;
    }

    public BufferedImage getDrei04() {
        return drei04;
    }

    public BufferedImage getVier01() {
        return vier01;
    }

    public BufferedImage getVier02() {
        return vier02;
    }

    public BufferedImage getVier03() {
        return vier03;
    }

    public BufferedImage getVier04() {
        return vier04;
    }

    public BufferedImage getVier05() {
        return vier05;
    }

    public BufferedImage getVier06() {
        return vier06;
    }

    public BufferedImage getFuenf01() {
        return fuenf01;
    }

    public BufferedImage getFuenf02() {
        return fuenf02;
    }

    public BufferedImage getFuenf03() {
        return fuenf03;
    }

    public BufferedImage getFuenf04() {
        return fuenf04;
    }

    public BufferedImage getFuenf05() {
        return fuenf05;
    }

    public BufferedImage getFuenf06() {
        return fuenf06;
    }

    public BufferedImage getlT() {
        return lT;
    }

    public BufferedImage getrT() {
        return rT;
    }

    public BufferedImage getWurzel() {
        return wurzel;
    }

    public BufferedImage getAnfang() {
        return anfang;
    }
}
