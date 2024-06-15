
public class Main {

	public static void main (String[] args) {
		Cliente Ariel = new Cliente();
		Ariel.setNome(" Ariel ");
		
		Conta cc = new ContaCorrente(Ariel);
		Conta poupanca = new ContaPoupanca(Ariel);
		cc.transferir(100, poupanca);
		cc.depositar(150);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
