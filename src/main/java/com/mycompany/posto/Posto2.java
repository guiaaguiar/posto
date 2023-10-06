package com.mycompany.posto;


public class Posto2 {
    public double litros, valor, gas, alc, des;
        
    public double gasolina(){
        if (litros <= 20){
        des =  litros * 0.03;
        valor = (gas * litros) - (des);
                return valor;
        }
        else{
        des = litros * 0.05;
        valor = (gas * litros) - (des);
                return valor;
        }
    }
    
    public double alcool(){
        if (litros <= 20){
        des = litros * 0.04;
        valor = (alc * litros) - (des);
                return valor;
        }
        else {
        des = litros * 0.06;
        valor = (alc * litros) - (des);
                return valor;
        }    
    }
}
