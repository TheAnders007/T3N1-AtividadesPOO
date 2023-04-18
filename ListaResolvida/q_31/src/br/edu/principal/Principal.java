package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String args[])
	   { 
	    int m, n, soma;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o valor para m:");
	    m = sc.nextInt();
	    System.out.println("\nDigite o valor para n:");
	    n = sc.nextInt();
	   
	    while (m < n){
	      soma = 0;
	      for (int i = m; i <= n; i++){
	        soma = soma + i;
	      }
	      System.out.println("\nA soma entre os números entre o intervalo dos dois números anteriores " + soma + ".\n");
	      System.out.println("Digite o valor para m:");
	      m = sc.nextInt();
	      System.out.println("\nDigite o valor para n:");
	      n = sc.nextInt();
	    }
	    if (m > n) {
	      System.out.println("m está maior que n, por isso a execução foi encerrada.");
	    }
	    if (m == n) {
		      System.out.println("m é igual a n, por isso a execução foi encerrada.");
		   }
	  }   
}
