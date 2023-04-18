package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	double preco, imp, transp = 0, seguro, Final, total_imp = 0, origem;
	String meio_t, carga = "";
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite o preço unitário em reais do produto: " + "\nR$");
	preco = sc.nextDouble();
	
	while (preco > 0) {
		System.out.println("Digite a origem do produto (1 - EUA, 2 - México, 3 - outro país): ");
		origem = sc.nextDouble();
		System.out.println("Digite o meio de transporte do produto (T - Terrestre, F - Fluvial, A - Aéreo): ");
		meio_t = sc.next();
		System.out.println("Digite se o produto é uma carga perigosa (S - Sim, N - Não): ");
		carga = sc.next();
		
		if (preco <= 100) {
			imp = (preco * 5) / 100;
		} else {
			imp = (preco * 10) / 100;
		}
		
		if (carga == "S") {
			if (origem == 1) {
				transp = 50;
			}
			if (origem == 2) {
				transp = 35;
			}
			if (origem == 3) {
				transp = 24;
			}
		}
		
		if (carga == "N") {
			if (origem == 1) {
				transp = 12;
			}
			if (origem == 2) {
				transp = 35;
			}
			if (origem == 3) {
				transp = 60;
			}
		}
		
		if (origem == 2 || meio_t == "A") {
			seguro = preco / 2;
		} else {
			seguro = 0;
		}
		
		Final = preco + imp + transp + seguro;
		total_imp = total_imp + imp;
		
		System.out.println("O imposto será de: \nR$" + imp);
		System.out.println("O valor de transporte será de: \nR$" + transp);
		System.out.println("O valor do seguro será de: \nR$" + seguro);
		System.out.println("O preço final será de: \nR$" + Final);
		System.out.print("Digite o preço unitário em reais do produto: " + "\nR$");
		preco = sc.nextDouble();
	}
	
	System.out.println("O total de impostos será de: \nR$" + total_imp);

	}

}
