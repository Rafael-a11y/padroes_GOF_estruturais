import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PosVenda 
{
	public void agendarContato(String cliente, String produto)
	{
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 30);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(c.getTime());
		
		System.out.println("P�S VENDA\n\tEntrar em contato com o cliente " + " sobre o produto " + produto +
				" no dia " + format);
	}
}
