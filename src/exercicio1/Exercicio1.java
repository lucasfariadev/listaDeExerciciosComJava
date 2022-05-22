package exercicio1;/*Escreva um programa que, com base em uma
 temperatura em graus celsius, a converta e exiba
  em Kelvin (K), Réaumur (Re), Rankine (Ra) e 
  Fahrenheit (F), seguindo as fórmulas: 
  F = C * 1.8 + 32; K = C + 273.15;
   Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67 */

import java.util.Scanner;

public class Exercicio1{
    public static void main(String args[]){
        DegreesConverter degreesConverter = new DegreesConverter();
        System.out.print("Digite o valor em Celsius: ");
        Scanner celsius = new Scanner(System.in);
        double degree;
        degree = celsius.nextDouble();
        degreesConverter.convertDegrees(degree);


        }
}