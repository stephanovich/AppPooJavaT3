package testes;

import negocio.Politico;

public class TestaPolitico {
	public static void main(String[] args) {
		Politico p1 = new Politico(); 
		p1.nome = "jose";
		p1.salario = 1000;
		p1.qtdeMandatos = 1;
		p1.senador = true;
		p1.show();
		
		Politico p2 = new Politico("joao",1000);
		p2.qtdeMandatos = 1;
		p2.senador = false;
		p2.show();
	}
}
