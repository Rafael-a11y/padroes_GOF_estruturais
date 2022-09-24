
public class GeradorDeArquivoHTML implements GeradorDeArquivo
{
	@Override
	public void gerar(String conteudo) 
	{ 
		System.out.println("Gerando arquivo .HTML:\n\n" + conteudo);
	}
}
