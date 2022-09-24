
public class TesteProxy {

	public static void main(String[] args)
	{
		Conta contaPadrao = new ContaPadrao(); 
		Conta contaProxy = new ContaProxy (contaPadrao); 
		contaProxy.depositar(100); 
		contaProxy.sacar(59);
		System.out.println("Saldo: " + contaProxy.getSaldo());

	}

}
