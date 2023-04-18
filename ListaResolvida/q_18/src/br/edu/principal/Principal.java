package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	int i;
	int num;
	int qtde = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira um número inteiro maior que 1: ");
	num = sc.nextInt();
	
	for (i = 1; i <= num; i++) {
		if (num % i == 0) {
			qtde = qtde + 1;
		}
	}
	
	if (qtde > 2) {
		System.out.println("Número não primo.");
	} else {
		System.out.println("Número primo.");
	}

	}

}
