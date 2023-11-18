package org.example.firma;

public abstract class Osoba {
    public String imie;
    public String nazwisko;
    public String dzial;
    public Integer wynagrodzenie;
    public abstract void przedstawSie();

    public Osoba() {}

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDzial(String dzial) {
        this.dzial = dzial;
    }

    public void setWynagrodzenie(Integer wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
}
