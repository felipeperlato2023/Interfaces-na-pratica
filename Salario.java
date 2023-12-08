package Interfaces;

public abstract class Salario implements Calculos {

	public String nome;

	public String funcao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Salario() {

	}

	public Salario(String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}

	@Override
	public double salario(double valordia, int dias) {
		return valordia * dias;
	}

	@Override
	public double parcelas(double salariofinal) {

		double parcelado = salariofinal / parcela;

		return parcelado;
	}

}
