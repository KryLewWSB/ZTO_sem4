package org.example;

public class Kierownik extends Pracownik{
    private int premiaKierownicza;
    public Kierownik(String imie, String nazwisko, int wyplata, int premiaKierownicza) {
        super(imie, nazwisko, wyplata);
        this.premiaKierownicza = premiaKierownicza;
    }
    @Override
    public String getData(){
        return "\nImię: " + this.imie +
                "\nNazwisko: " + this.nazwisko +
                "\nWypłata: " + this.wyplata +
                "\nPremia kierownicza: " + this.premiaKierownicza;
    }
}