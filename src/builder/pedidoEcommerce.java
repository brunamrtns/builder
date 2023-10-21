package builder;

public class pedidoEcommerce {

	private String nomeCliente;
	private String fone;
	private String endereco;
	private String nomeProduto;
	private int qtdProduto;
	private double valProduto;
	private double valDesconto;
	private double valFrete;
	private double valTotPedido;

	protected pedidoEcommerce(){
	}

	public static pedidoEcommerce builder(){
		return new pedidoEcommerce();
	}

	//getters 

	public String getNomeCliente(){
		return nomeCliente;
	}
	public String getFone(){
		return fone;
	}
	public String getEndereco(){
		return endereco;
	}
	public String getNomeProduto(){
		return nomeProduto;
	}
	public int getQtdProduto(){
		return qtdProduto;
	}
	public double getValProduto(){
		return valProduto;
	}
	public double getValDesconto(){
		return valDesconto;
	}
	public double getValFrete(){
		return valFrete;
	}
	public double getValTotPedido(){
		return valTotPedido;
	}

	//setters

	protected void setNomeCliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
    }
	protected void setFone(String fone){
        this.fone = fone;
    }
    protected void setEndereco(String endereco){
        this.endereco = endereco;
    }
    protected void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    protected void setQtdProduto(int qtdProduto){
        this.qtdProduto = qtdProduto;
    }
    protected void setValProduto(double valProduto){
        this.valProduto = valProduto;
    }
    protected void setValDesconto(double valDesconto){
        this.valDesconto = valDesconto;
    }
    protected void setValFrete(double valFrete){
        this.valFrete = valFrete;
    }
    protected void setValTotPedido(double valTotPedido){
        this.valTotPedido = valTotPedido;
    }

    @Override
    public String toString(){
        return "pedidoEcommerce{" + '\n' + 
                "nome_cliente = " + nomeCliente + '\n' + 
                "fone = " + fone + '\n' +
                "endereço = " + endereco + '\n' +
                "nome_produto = " + nomeProduto + '\n' +
                "qtd_produto = " + qtdProduto + '\n' +
                "valor_produto = " + valProduto + '\n' +
                "valor_desconto = " + valDesconto + '\n' +
                "valor_frete = " + valFrete + '\n' +
                "valor_total_pedido = " + valTotPedido + '\n' +
                '}';
    }
}
