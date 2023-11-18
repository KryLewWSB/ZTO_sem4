package org.example.firma;

public class Kierownik extends Osoba {
    @Override
    public void przedstawSie() {
        System.out.println("_______________________");
        System.out.println("Jestem Kierownik.");
        System.out.println("Imię: " + this.imie +
                "\nNazwisko: " + this.nazwisko +
                "\nDział: " + this.dzial +
                "\nWynagrodzenie: " + this.wynagrodzenie);
        System.out.println("_______________________");
    }
}
