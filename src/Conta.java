
public abstract class Conta implements IConta {

	// ATRIBUTOS
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;

	private static final int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1;

	// M�TODOS CONSTRUTORES
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	// M�TODOS DE A��O
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Ag�ncia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
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
