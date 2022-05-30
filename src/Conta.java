
public abstract class Conta implements IConta {

	// ATRIBUTOS
	protected int agencia;
	protected int conta;
	protected double saldo;

	private static final int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1;

	// MÉTODOS CONSTRUTORES
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
	}

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
