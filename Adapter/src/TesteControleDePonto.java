public class TesteControleDePonto
{
	public static void main(String[] args) throws InterruptedException
	{
		ControleDePonto controleDePonto = new ControleDePontoAdapter(); 
		Funcionario funcionario = new Funcionario ("Marcelo Martins"); 
		controleDePonto. registraEntrada(funcionario); 
		Thread. sleep (10000); 
		controleDePonto. registraSaida(funcionario);
	}
}
