package my_project.model;

public class Antwort {
    private int folgeBaum;
    private String text;


    public Antwort(int folgeBaum, String antwortText) {
        this.folgeBaum = folgeBaum;
        text = antwortText;
    }

    public String getAntwortText(){
        return text;
    }

    public int getFolgeBaum() {
        return folgeBaum;
    }
}
