package com.mycompany.posto;

import java.util.Scanner;
public class Posto {

    public static void main(String[] args) {
        Posto2 p = new Posto2();
        int opcao = 0;
        p.alc = 5;
        p.gas = 7;
        
        Scanner leia2 = new Scanner(System.in);
        System.out.println("Qual tipo? 1 = álcool (R$ 5/L). 2 = gasolina (R$7/L). ");
        opcao = leia2.nextInt();
        
        if (opcao == 1){
        Scanner leia1 = new Scanner(System.in);
        System.out.println("Quantos litros? ");
        p.litros = leia1.nextDouble();
        System.out.println("Valor a ser pago: "+p.alcool());
        }
        else if (opcao == 2){
        Scanner leia1 = new Scanner(System.in);
        System.out.println("Quantos litros? ");
        p.litros = leia1.nextDouble();
        System.out.println("Valor a ser pago: "+p.gasolina());
        }
    }
}
