package my_project.model;

public class Frage {
    private String text;
    private Antwort[] antworten;

    public Frage(String fragenText, String antwort1, int folge1, String antwort2, int folge2, String antwort3, int folge3, String antwort4, int folge4){
        text = fragenText;
        antworten = new Antwort[4];
        antworten[0] = new Antwort(folge1, antwort1);
        antworten[1] = new Antwort(folge2, antwort2);
        antworten[2] = new Antwort(folge3, antwort3);
        antworten[3] = new Antwort(folge4, antwort4);
    }

    public String getText() {
        return text;
    }

    public Antwort[] getAntworten() {
        return antworten;
    }
}
