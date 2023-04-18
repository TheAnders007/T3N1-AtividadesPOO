package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	double cont, cod, num_vei, num_acid, maior, cid_maior, menor, cid_menor, media_vei, soma_vei, media_acid, soma_acid, cont_acid;
	
	soma_vei = 0;
	soma_acid = 0;
	cont_acid = 0;
	maior = 0;
	menor = 0;
	cid_maior = 0;
	cid_menor = 0;
	
	Scanner sc = new Scanner(System.in);
	
	for (cont = 1; cont <= 5; cont++) {
		System.out.println("Insira o código da cidade aqui: ");
		cod = sc.nextDouble();
		System.out.println("Insira o número de veículos de passeio: ");
		num_vei = sc.nextDouble();
		System.out.println("Insira o número de acidentes de trânsito com vítimas: ");
		num_acid = sc.nextDouble();
		
		if (cont == 1) {
			maior = num_acid;
			cid_maior = cod;
			menor = num_acid;
			cid_menor = cod;
		} else if (num_acid > maior) {
			maior = num_acid;
			cid_maior = cod;
		}
		if (num_acid < menor) {
			menor = num_acid;
			cid_menor = cod;
		}
		
		soma_vei = soma_vei + num_vei;
		if (num_vei < 2000) {
			soma_acid = soma_acid + num_acid;
			cont_acid = cont_acid + 1;
		}
	}	
System.out.println("O maior índice de acidentes de trânsito é de " + maior + " da cidade " + cid_maior + ".");
System.out.println("O menor índice de acidentes de trânsito é de " + menor + " da cidade " + cid_menor + ".");
		
media_vei = soma_vei / 5;
		
System.out.println("A média de veículos nas cinco cidades juntas é de " + media_vei + " veículos.");
		
if (cont_acid == 0) {
	System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
} else {
	media_acid = soma_acid / cont_acid;
	System.out.println("A média de acidentes de trânsito nas cidades com menos de 2000 veículos de passeio foi de " + media_acid + " acidentes.");
}
	

	}

}
