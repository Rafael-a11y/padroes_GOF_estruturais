public class TesteRecibo 
{
	public static void main(String[] args)
	{ 
		Recibo recibo = new Recibo ("arquivo.txt", "K19 Treinamentos", "Marcelo Martinnnnns", 1000, 
				new GeradorDeArquivoHTML()); 
		recibo. gerarArquivo();
	}
}
