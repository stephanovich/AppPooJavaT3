package negocio;

public class Politico {
	final int TEMPO_MANDATO_SENADOR = 8;
	final int TEMPO_MANDATO = 4;
	final int MESES_ANO = 12;
	public String nome;
	public int qtdeMandatos;
	public float salario;
	public boolean senador;
	
	private float calcularSalarioTotal() {
		return senador ? ((MESES_ANO * TEMPO_MANDATO_SENADOR) *qtdeMandatos ) * salario : ((MESES_ANO * TEMPO_MANDATO) *qtdeMandatos ) * salario;
	}
	public void show() {
		System.out.printf("%s arrecadou R$%.2f em sua vida política\n",
				nome,
				calcularSalarioTotal()
				);
	}
	public Politico(){
		nome = "Nada Informado";
		salario = 999;
		qtdeMandatos = 1;	
	}
	public Politico(String nome,float salario) {
		this();
		this.nome = nome;
		this.salario = salario;
	}

}

