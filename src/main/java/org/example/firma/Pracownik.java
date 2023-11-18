package org.example.firma;

public class Pracownik extends Osoba {
    @Override
    public void przedstawSie() {
        System.out.println("_______________________");
        System.out.println("Jestem pracownikiem.");
        System.out.println("Imię: " + this.imie +
                            "\nNazwisko: " + this.nazwisko +
                            "\nDział: " + this.dzial +
                            "\nWynagrodzenie: " + this.wynagrodzenie);
        System.out.println("_______________________");
    }
}
