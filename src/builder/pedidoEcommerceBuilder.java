package builder;

public class pedidoEcommerceBuilder {

	private pedidoEcommerce pedidoEcommerce;

	private pedidoEcommerceBuilder(){
	    pedidoEcommerce = new pedidoEcommerce();   
	}

	public static pedidoEcommerceBuilder builder(){
	        return new pedidoEcommerceBuilder();
	}

	public pedidoEcommerceBuilder nomeCliente(String nomeCliente){
	    this.pedidoEcommerce.setNomeCliente(nomeCliente);
	    return this;
	}
	public pedidoEcommerceBuilder fone(String fone){
	    this.pedidoEcommerce.setFone(fone);
	    return this;
	}
	public pedidoEcommerceBuilder endereco(String endereco){
	    this.pedidoEcommerce.setEndereco(endereco);
	    return this;
	}
	public pedidoEcommerceBuilder nomeProduto(String nomeProduto){
	    this.pedidoEcommerce.setNomeProduto(nomeProduto);
	    return this;
	}
	public pedidoEcommerceBuilder qtdProduto(int qtdProduto){
	    this.pedidoEcommerce.setQtdProduto(qtdProduto);
	    return this;
	}
	public pedidoEcommerceBuilder valProduto(double valProduto){
	    this.pedidoEcommerce.setValProduto(valProduto);
	    return this;
	}
	public pedidoEcommerceBuilder valDesconto(double valDesconto){
	    this.pedidoEcommerce.setValDesconto(valDesconto);
	    return this;
	}
	public pedidoEcommerceBuilder valFrete(double valFrete){
	    this.pedidoEcommerce.setValFrete(valFrete);
	    return this;
	}
	public pedidoEcommerceBuilder valTotPedido(double valTotPedido){
	    this.pedidoEcommerce.setValTotPedido(valTotPedido);
	    return this;
	}

	public pedidoEcommerce build(){
	    return this.pedidoEcommerce;
	}
}
