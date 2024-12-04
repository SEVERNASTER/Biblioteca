package Main;


import java.util.Scanner;

import Themes.Colores;

public class Principal extends Colores{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("UMSS", "Oquendo something");
        biblioteca.iniciar();
        System.out.println("\t\t\t\t" + cyanBg + "Programa Terminado :)" + reset);
        System.out.println();
        sc.close();
    }
}
