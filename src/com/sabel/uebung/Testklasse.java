package com.sabel.uebung;

import java.util.ArrayList;

public class Testklasse {
    public static void main(String[] args) {
        Person person = new Person(" Tom",32);
        //System.out.println(person.getName());
        //System.out.println(person.getAlter());
        //person.druckeInfo();
        //System.out.println(person);
        Personenverwaltung personenverwaltung = new Personenverwaltung(3);
        System.out.println(personenverwaltung.anzahlPersonen()); // leere Liste => 0
        personenverwaltung.hinzufuegen(person); // Person "Tom" der Liste hinten hinzufügen
        personenverwaltung.hinzufuegen(new Person(" Max", 37)); // anonymes Objekt, weil keine lokale Referenz existiert
        System.out.println(personenverwaltung.anzahlPersonen()); // 2 Personen hinzugefügt => 2
        Person geloeschtePerson = personenverwaltung.loeschePerson(1);
        personenverwaltung.hinzufuegen(new Person(" Tanja", 27));
        Person person1 = personenverwaltung.gibPerson(1);
        person1.setAlter(person1.getAlter()+ 1); // Tanja hat Geburtstag
        personenverwaltung.gibPerson(1).setAlter(29); // Tanja hat erneut Geburtstag!
        System.out.println(personenverwaltung.gibPerson(1)); // Ausgabe der toString von Tanja
        System.out.println("Alle Personen in der Personenverwaltung: ");
        personenverwaltung.allePersonenAnzeigen();
        System.out.println(personenverwaltung.anzahlPersonen());
        System.out.println(personenverwaltung);
        System.out.println(personenverwaltung.berechneDurchschnittsalter());
        // Aus der Personenverwaltung alle Personen die Älter sind als 30
        System.out.println("Personen, die älter als 30 sind: ");
        ArrayList<Person> personenAelterAls30 = personenverwaltung.gibPersonenAelterAls(30);
        for (Person person2 : personenAelterAls30) {
            System.out.println(person2);
        }
    }


}
