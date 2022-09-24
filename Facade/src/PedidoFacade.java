public class PedidoFacade 
{
	private Estoque estoque;
	private Financeiro financeiro;
	private PosVenda posVenda;
	
	public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posVenda)
	{
		
		this.estoque = estoque;
		this.financeiro = financeiro;
		this.posVenda = posVenda;
	}
	
	public void registrarPedido(Pedido pedido)
	{
		this.estoque.enviarProduto(pedido.getProduto(), pedido.getEnderecoDeEntrega());
		this.financeiro.fatura(pedido.getCliente(), pedido.getProduto());
		this.posVenda.agendarContato(pedido.getCliente(), pedido.getProduto());
	}
}
