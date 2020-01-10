package br.com.reflection;

public class Main {
	
	public static void main(String[] args) {
		
		RefletirPessoa refletindo = new RefletirPessoa();
		System.out.println("Lista todos os métodos refletidos da classe refletida: \n");
		refletindo.listaNomeDosMetodos();
		System.out.println("Lista de atributos:");
		refletindo.atributos();
		System.out.println("Invoca métodos da classe:");
		refletindo.invocaMetodos();
	}

}
