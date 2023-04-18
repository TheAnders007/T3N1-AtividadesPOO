package br.edu.principal;

public class Principal {
	public static void main(String args[])
	{ 
	  int qtd = 0, num = 1;
	  System.out.print("°°° OS 5 PRIMEIROS MÚLTIPLOS DE 3 °°°\n");
	  while (qtd < 5){
	    if ((num % 3 == 0)){
	      if (qtd < 4) {
	        System.out.print(num + ", ");
	        ++qtd;
	      }
	      else if (qtd == 4) {
	    	  System.out.print(num + ".");
	    	  ++qtd;
	      }
	    }   
	    ++num;
	  }
	 
   }
}
