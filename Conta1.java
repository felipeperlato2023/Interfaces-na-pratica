package Interfaces;

public class Conta1 extends Salario {

	public int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta1() {
		
		// TODO Auto-generated constructor stub
	}

	public Conta1(String nome, String funcao, int numero) {
		super(nome, funcao);
		this.numero = numero;
		// TODO Auto-generated constructor stub
	}

}
