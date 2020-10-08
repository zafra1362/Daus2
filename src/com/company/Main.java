package com.company;

import java.util.Scanner;

public class Main {
    static {scanner = new Scanner(System.in);}
    public static Scanner scanner;
    public static int menu() {
        System.out.println("0.- Acabar");
        System.out.println("1.- Jugar");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int tirades = 0;
        int pg = 0;
        JocDaus partida = new JocDaus();

        for(int a = menu(); a != 0; a = menu()) {
            ++tirades;
            boolean b = partida.jugar();
            System.out.println(partida);
            if (b) {
                System.out.println("Has guanyat!");
                ++pg;
            }
        }

        System.out.println("Has guanyat " + pg + " partides");
    }
}



