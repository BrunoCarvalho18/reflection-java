package br.com.reflection;

import java.lang.reflect.*;

public class RefletirPessoa {

	public void listaNomeDosMetodos() {
		try {
			Class cl = Class.forName("br.com.reflection.Pessoa");
			Method[] metodos = cl.getDeclaredMethods();

			for (int i = 0; i < metodos.length; i++) {
				System.out.println(metodos[i].toString());
			}

		} catch (Throwable e) {
			System.out.println(e);
		}
	}

	public void atributos() {
		try {
			Class cl = Class.forName("br.com.reflection.Pessoa");
			Method[] metodos = cl.getDeclaredMethods();

			for (int i = 0; i < metodos.length; i++) {
				Method m = metodos[i];
				System.out.println("Nome do método:" + m.getName());
				System.out.println("Tipo do retorno:" + m.getReturnType());
			}

		} catch (Throwable e) {
			System.out.println(e);
        }
	}
	
	public void invocaMetodos() {
		Pessoa pessoa = new Pessoa("Bruno Carvalho", 23, "RG da pessoa", "CPF da pessoa");
		
		try {
			Class cl = Class.forName("br.com.reflection.Pessoa");	
			Field[] campos = cl.getDeclaredFields();	
			Method[] metodos = cl.getDeclaredMethods();
			
			for (int i = 0; i < metodos.length; i++) {
				
				System.out.println(metodos[i].invoke(pessoa));
			
			}
			
		} catch (Throwable e) {
			System.out.println(e);
		}
	}

}
