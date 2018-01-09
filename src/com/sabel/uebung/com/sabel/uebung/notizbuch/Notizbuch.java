package com.sabel.uebung.com.sabel.uebung.notizbuch;


import java.util.ArrayList;

public class Notizbuch {
    private ArrayList<String> notizen;

    public Notizbuch() {
        notizen = new ArrayList<>();
    }

    public int anzahlNotizen() {
        return notizen.size();
    }

    public void hinzufuegen(String notiz) {
        notizen.add(notiz);
    }

    public void zeigeNotiz(int index) {
        if (index < 0) {
            System.out.println("Index darf nicht negativ sein");
        } else if (index < anzahlNotizen()) {
            System.out.println(notizen.get(index));
        } else {
            System.out.println("Index zu groß");
        }
    }

    public String loescheNotiz(int index) {
        if (index < 0 || index >= anzahlNotizen()) {
            System.out.println("Falscher Index");
            return null;
        }
        String zuloeschendeNotiz = notizen.get(index);
        notizen.remove(index);
        return zuloeschendeNotiz;
        //return notizen.remove(index);
    }
    public void alleNotizenAnzeigen(){
        for (String notiz : notizen) {
            System.out.println(notiz);
        }
    }

    @Override
    public String toString() {
        String result = "Notizbuch:\n";
        for (String notiz : notizen) {
            result = result + notiz + "\n";
        }
        return result;
    }
}
