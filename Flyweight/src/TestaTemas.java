public class TestaTemas
{
	public static void main(String[] args) 
	{
		Apresentacao a = new Apresentacao(); 
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.K19), 
				"K11 - Orientação a Objetos em Java", 
				"Com este curso você vai obter uma base sólida de conhecimentos de Java\ne de Orientação a Objetos."));
		
		
		a.adicionaSlide(new Slide(TemaFlyweightFactory.getTema(TemaFlyweightFactory.ASTERISCO), 
				"K12 - Desenvolvimento Web com JSF2 e JPA2",
				"Depois deste curso, você estará apto a\ndesenvolver aplicações Web com\nos padrões da plataforma Java.")); 
		
		
		a. adicionaSlide(new Slide (TemaFlyweightFactory.getTema(TemaFlyweightFactory.HIFEN), 
		"K21 - Persistência com JPA2 e Hibernate", 
		"Neste curso de Java Avançado, abordamos de\n maneira profunda os recursos de persistênciaIn" + "do JPA2 e do Hibernate."));
		
		
		a. imprime();
	}
}
