package com.example.javabasico;

import questoes.*;

public class Main {
    public static void main(String[] args) {
        Idade idade = new Idade(4, 5, 15);
        idade.calcular();

        System.out.println("");

        Media media = new Media(8, 9, 7, 4, 5, 6);
        media.mediaAri();

        System.out.println("");

        Saldo saldo = new Saldo(2500);
        saldo.porcentagem();

        System.out.println();

        Peca peca = new Peca(25, "A1257B", 3.50, 50, "XIP009", 8.90, 10);
        peca.calcularIPI();

        System.out.println();

        SalarioMin salarioMin = new SalarioMin(10000);
        salarioMin.qtsSalariosMin();

        System.out.println();

        AnteSuc anteSuc = new AnteSuc(44);
        anteSuc.antSuc();


    }
}
