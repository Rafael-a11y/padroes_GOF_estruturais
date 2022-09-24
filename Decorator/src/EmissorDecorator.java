public abstract class EmissorDecorator implements Emissor
{
	private Emissor emissor;

	public EmissorDecorator(Emissor emissor) 
	{
		this.emissor = emissor;
	}
	
	public abstract void enviar(String mensagem);

	public Emissor getEmissor() 
	{
		return emissor;
	}
	
	
	
	
}
