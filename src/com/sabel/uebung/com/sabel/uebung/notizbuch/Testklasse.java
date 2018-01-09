package com.sabel.uebung.com.sabel.uebung.notizbuch;

public class Testklasse {
    public static void main(String[] args) {
        System.out.println("Programm gestartet");
        Notizbuch notizbuch = new Notizbuch();
        System.out.println(notizbuch.anzahlNotizen());
        notizbuch.hinzufuegen("09:30 Kaffepause");
        notizbuch.hinzufuegen("09:45 Mathe");
        notizbuch.hinzufuegen("11:15 Programmieren");
        System.out.println(notizbuch.anzahlNotizen());
        notizbuch.zeigeNotiz(-3);
        notizbuch.zeigeNotiz(1);
        notizbuch.zeigeNotiz(3);
        notizbuch.loescheNotiz(-1);
        String geloeschteNotiz = notizbuch.loescheNotiz(0);
        System.out.println("Gelöschte Notiz: " + geloeschteNotiz);
        System.out.println(notizbuch.anzahlNotizen());
        notizbuch.loescheNotiz(2);
       // notizbuch.alleNotizenAnzeigen();
        System.out.println(notizbuch);
        System.out.println("Programm beendet");
    }
}
