public class TestaTemas
{
	public static void main(String[] args) 
	{
		Apresentacao a = new Apresentacao(); 
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.K19), 
				"K11 - Orienta��o a Objetos em Java", 
				"Com este curso voc� vai obter uma base s�lida de conhecimentos de Java\ne de Orienta��o a Objetos."));
		
		
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCO), 
				"K12 - Desenvolvimento Web com JSF2 e JPA2",
				"Depois deste curso, voc� estar� apto a\ndesenvolver aplica��es Web com\nos padr�es da plataforma Java.")); 
		
		
		a. adicionaSlide(new Slide (TemaFlyweightFactory.getTema(TemaFlyweightFactory.HIFEN), 
		"K21 - Persist�ncia com JPA2 e Hibernate", 
		"Neste curso de Java Avan�ado, abordamos de\n maneira profunda os recursos de persist�nciaIn" + "do JPA2 e do Hibernate."));
		
		
		a. imprime();
	}
}
