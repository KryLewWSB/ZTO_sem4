package org.example;

public class Pracownik {
    protected String imie;
    protected String nazwisko;
    protected int wyplata;
    public Pracownik(String imie, String nazwisko, int wyplata){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }
    public String getData(){
        return "\nImię: " + this.imie +
                "\nNazwisko: " + this.nazwisko +
                "\nWypłata: " + this.wyplata;
    }
    @Override
    public String toString(){
        return this.getData();
    }
}
