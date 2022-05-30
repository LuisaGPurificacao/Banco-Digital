
public abstract class Conta implements IConta{
	
	// ATRIBUTOS
	private int agencia;
	private int conta;
	private double saldo;

	// MÉTODOS DE AÇÃO
	@Override
	public void sacar(double valor) {
		
	}

	@Override
	public void depositar(double valor) {
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
	}
	
	// MÉTODOS GETS E SETS
	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

}
