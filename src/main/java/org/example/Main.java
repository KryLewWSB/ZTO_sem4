package org.example;

import org.example.figury.*;
import org.example.firma.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        Shape square = shapeFactory.createShape(ShapeType.SQUARE);
        circle.draw();
        square.draw();*/

        FabrykaOsob fabrykaOsob = new FabrykaOsob();
        List<Osoba> listaOsob = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Kogo chcesz dodać (pracownik, kierownik, jeśli x to zakończ): ");
            String odpowiedz = scan.next();
            if (odpowiedz.equals("pracownik")) {
                listaOsob.add(fabrykaOsob.utworzOsobe(Stanowisko.PRACOWNIK));
                int index = listaOsob.size() - 1;
                System.out.println("Wprowadź imię pracownika: ");
                String imie = scan.next();
                listaOsob.get(index).setImie(imie);

                System.out.println("Wprowadź nazwisko pracownika: ");
                String nazwisko = scan.next();
                listaOsob.get(index).setNazwisko(nazwisko);

                System.out.println("Wprowadź dział pracownika: ");
                String dzial = scan.next();
                listaOsob.get(index).setDzial(dzial);

                System.out.println("Wprowadź wynagrodzenie pracownika: ");
                int wynagrodzenie = scan.nextInt();
                listaOsob.get(index).setWynagrodzenie(wynagrodzenie);

            } else if (odpowiedz.equals("kierownik")) {

                listaOsob.add(fabrykaOsob.utworzOsobe(Stanowisko.KIEROWNIK));
                int index = listaOsob.size() - 1;
                System.out.println("Wprowadź imię Kierownika: ");
                String imie = scan.next();
                listaOsob.get(index).setImie(imie);

                System.out.println("Wprowadź nazwisko Kierownika: ");
                String nazwisko = scan.next();
                listaOsob.get(index).setNazwisko(nazwisko);

                System.out.println("Wprowadź dział Kierownika: ");
                String dzial = scan.next();
                listaOsob.get(index).setDzial(dzial);

                System.out.println("Wprowadź wynagrodzenie Kierownika: ");
                int wynagrodzenie = scan.nextInt();
                listaOsob.get(index).setWynagrodzenie(wynagrodzenie);

            }else{
                break;
            }
        }


        for (Osoba osoba : listaOsob) {
                osoba.przedstawSie();
        }



    }
}