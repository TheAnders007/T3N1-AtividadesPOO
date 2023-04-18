package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String args[])
	   { 
	     
	     Scanner sc = new Scanner(System.in);
	     
	     int cont, num, alt, maior = 0, numMaior = 0, menor = 0, numMenor = 0;
	     
	     for (cont = 1; cont <= 10; cont++){
	       System.out.println("\nDigite o número do aluno:");
	       num = sc.nextInt();
	       System.out.println("Digite a altura, em centímetros, do aluno:");
	       alt = sc.nextInt();
	       if (cont == 1){
	         maior = alt;
	         numMaior = num;
	         menor = alt;
	         numMenor = num;
	       }
	       else{
	         if (alt > maior){
	           maior = alt;
	           numMaior = num;
	         }
	         if (alt < menor){
	           menor = alt;
	           numMenor = num;
	         }
	       }
	     }
	     System.out.println("\nO aluno mais alto é o n° " + numMaior + ", com " + maior + " centímetros de altura.");
	     System.out.println("O aluno mais baixo é o n° " + numMenor + ", com " + menor + " centímetros de altura.");
	     
	}
}
