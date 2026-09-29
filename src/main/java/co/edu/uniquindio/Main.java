package co.edu.uniquindio;

import static co.edu.uniquindio.RecorrerArreglo.recorrer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        recorrer(numeros, 0);
    }
}