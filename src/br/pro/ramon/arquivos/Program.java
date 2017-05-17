package br.pro.ramon.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner dados = new Scanner(new File("dados.txt"));

        int n = dados.nextInt();
        for (int i = 0; i < n; i++) {
            String nome = dados.next();
            double peso = dados.nextDouble();
            double altura = dados.nextDouble();

            double imc = peso / (altura * altura);
            System.out.printf("%s tem IMC %.2f.%n", nome, imc);
        }
    }

}
