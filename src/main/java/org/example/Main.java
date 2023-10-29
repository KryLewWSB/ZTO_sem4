package org.example;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Adam", "Kowalski", 5000);
        Kierownik kierownik = new Kierownik("Adela", "Nowakowska", 8000, 2000);

        System.out.println("Imięt pracownik: " + pracownik.imie +
                           "\nNazwisko pracownik: " + pracownik.nazwisko +
                            "\nPensja pracownik: " + pracownik.wyplata);

        System.out.println("\nImięt pracownik: " + kierownik.imie +
                        "\nNazwisko pracownik: " + kierownik.nazwisko +
                        "\nPensja pracownik: " + kierownik.wyplata +
                        "\nPremia kierownicza " + kierownik.premiaKierownicza);

    }
}