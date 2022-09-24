public class TesteEmissorDecorator 
{
	public static void main(String[] args) 
	{
		String mensagem = "Rafael Souto Da Silva";
		Emissor emissorCriptografador = new EmissorDecoratorComCriptografia(new EmissorBasico()); 
		emissorCriptografador.enviar(mensagem);
		
		Emissor emissorCompressor = new EmissorDecoratorComCompressao(new EmissorBasico()); 
		emissorCompressor.enviar(mensagem);
		
		Emissor emissorCriptografadorECompressor = 
				new EmissorDecoratorComCriptografia (new EmissorDecoratorComCompressao(new EmissorBasico ())); 
		emissorCriptografadorECompressor.enviar(mensagem);
	}
}
