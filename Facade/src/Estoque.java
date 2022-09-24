import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Estoque 
{
	public void enviarProduto(String produto, String enderecoDeEntrega)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 2);
		SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");
		String format = spd.format(calendar.getTime());
		
		System.out.println("ESTOQUE\n\tO produto " + produto + " será entregue no endereço " 
		+ enderecoDeEntrega + " até às 18 horas do dia " + format);
	}
}
