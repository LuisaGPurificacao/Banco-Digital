
public class Main {
	public static void main(String[] args) {

		// OBJETOS
		Cliente joao = new Cliente();
		joao.setNome("Jo�o");
		
		Conta cc = new ContaCorrente(joao);
		Conta poupanca = new ContaPoupanca(joao);
		
		// UTILIZANDO OS M�TODOS
		cc.depositar(200);
		cc.transferir(105, poupanca);
		poupanca.sacar(45);
		
		// SYSOUT
		cc.imprimirExtrato();
		System.out.println("");
		poupanca.imprimirExtrato();
		
	}
}
