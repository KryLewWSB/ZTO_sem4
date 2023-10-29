package org.example;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Adam", "Kowalski", 5000);
        Kierownik kierownik = new Kierownik("Adela", "Nowakowska", 8000, 2000);

        System.out.println(pracownik.getData());

        System.out.println(kierownik.getData());

        System.out.println(pracownik + "\t" + pracownik.toString());
        System.out.println("-----");
        System.out.println(kierownik + "\t" + kierownik.toString());

    }
}