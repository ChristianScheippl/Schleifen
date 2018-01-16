package com.sabel.uebung.schleifen;

public class Schleifen {

    // Klassenmethode (statische Methode), nicht an ein Objekt gebunden
    // Aufruf: Klassenname.Methodenname();
    public static int summieren(int a, int b){
        int zaehler = a;
        int summe = 0;
        while (zaehler <= b) {
            summe += zaehler;
            zaehler++;
        }
        return summe;
    }

    public static boolean isPrim(int n){
        int teiler = 2;
        while (teiler < n){
            if (n % teiler == 0){ // teilt der Teiler die Zahl n ohne Rest, wenn ja, keine Primzahl
                return false;
            }
        }
        // Wenn alle Teiler "getestet", dann ist n eine Primzahl
        return true;
    }

    public static void main(String[] args) {

        // Ausgabe aller Primzahlen von 1_000_000 bis 2_000_000
        int zahl = 3_000_000;
        while (zahl < 3_100_000){
            if (isPrim(zahl)){
                System.out.println(zahl);
            }
            zahl++;
        }

        // Ist 127 eine Primzahl ?
        if (isPrim(127)){
            System.out.println("Ist Primzahl");
        }else {
            System.out.println("Ist keine Primzahl");
        }

        Schleifen schleifen = new Schleifen();
        int summe = schleifen.summieren(1, 10);
        System.out.println(summe);

        // Aufgabe 1: Ausgabe der Zahelen von 0 bis 4

        zahl = 0;
        while (zahl < 5){
            System.out.println(zahl);
            zahl++;
        }
        System.out.println("Wert von zahl nach der Schleife: " + zahl);

        // Aufgabe 2: Ausgabe aller Vielfachen von 20 bis 100 jeweils einschließlich

        zahl = 20;
        int count = 0;
        while (zahl < 101){
            System.out.println(zahl);
            zahl += 5;
            count++;
        }
        System.out.println("Die Schleife wurde " + count + "mal durchgelaufen");

        // Aufgabe 3: Ausgabe aller ungeraden Zahlen zwischen 3 und 250

        zahl = 3;
        while (zahl < 250){
            if (zahl % 2 != 0){
                System.out.println(zahl);
            }
            zahl++;
        }

    }
}
