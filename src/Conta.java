
public abstract class Conta implements IConta{
	
	// ATRIBUTOS
	private int agencia;
	private int conta;
	private double saldo;

	// M�TODOS DE A��O
	@Override
	public void sacar(double valor) {
		
	}

	@Override
	public void depositar(double valor) {
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
	}
	
	// M�TODOS GETS E SETS
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
