package com.Revan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lector {


    public static int solicitarentero(String mensaje) {
        Scanner leerentero = new Scanner(System.in);
        System.out.println(mensaje);
        try {


            int numero = leerentero.nextInt();

            return numero;
        }
        catch (InputMismatchException e ) {
            System.out.println("Debe ingresar un numero valido");
            return solicitarentero(mensaje);
        }

    }

    public static double solicitardouble(String mensaje) {
        Scanner leerdouble = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            double numero = leerdouble.nextDouble();
            return numero;
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero valido");
            return solicitardouble(mensaje);
        }

    }
}
