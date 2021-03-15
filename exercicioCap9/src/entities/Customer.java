package entities;

public class Customer {
	private String name;
	private double depInicial;
	protected int nrConta;
	public double valor;
	
	public Customer(String name, int nrConta, double depInicial) {
		this.name = name;
		this.depInicial = depInicial;
		this.nrConta = nrConta;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDepInicial() {
		return depInicial;
	}

	public void setDepInicial(double depInicial) {
		this.depInicial = depInicial;
	}

	public int getNrConta() {
		return nrConta;
	}
	
	public double totalConta() {
		return depInicial + valor;
	}

	public void addDeposito(double valor) {
		this.valor += valor;
	}

	public void removeSaque(double valor) {
		this.valor -= valor + 5.0;
	}

	public String toString() {
		return name + ", Nr Conta: " + nrConta + ", Deposito inicial: $"+ String.format("%.2f", depInicial)
				+ String.format(" Valor total na Conta: %.2f", totalConta());
	}
}