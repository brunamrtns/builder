package builder;

public class builderMain {
	
	public static void main(String[] args){
	    var pedido = pedidoEcommerceBuilder.builder()
	        .nomeCliente("bruna")
	        .endereco("UTFPR-DV")
	        .nomeProduto("nao sei")
	        .qtdProduto(2)
	        .valProduto(3.5)
	        .valFrete(1.00)
	        .valTotPedido(8.00)
	        .build();
	    var pedido2 = pedidoEcommerceBuilder.builder()
		        .nomeCliente("alberto")
		        .endereco("na casa dele")
		        .nomeProduto("cimento")
		        .qtdProduto(1)
		        .valProduto(75.90)
		        .valDesconto(5)
		        .valFrete(2)
		        .valTotPedido(72.90)
		        .build();

	    System.out.println(pedido);
	    System.out.println(pedido2);
	}
}
