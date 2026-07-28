import java.util.ArrayList;

public class Pedido {
	
	//atributos
	
	private double preco_total;

	private Endereco endereco_entrega;

	private ArrayList <ItemCardapio> listaItensPedidos;

	
	
	
	
	
	//construtor
	
	public Pedido(double preco_total, Endereco endereco_entrega) {
		super();
		this.preco_total = preco_total;
		this.endereco_entrega = endereco_entrega;
	}

	
	
	
	
	
	//gets e sets	

	public double getPreco_total() {
		return preco_total;
	}

	public void setPreco_total(double preco_total) {
		this.preco_total = preco_total;
	}

	public Endereco getEndereco_entrega() {
		return endereco_entrega;
	}

	public void setEndereco_entrega(Endereco endereco_entrega) {
		this.endereco_entrega = endereco_entrega;
	}

	public ArrayList<ItemCardapio> getListaItensPedidos() {
		return listaItensPedidos;
	}

	public void setListaItensPedidos(ArrayList<ItemCardapio> listaItensPedidos) {
		this.listaItensPedidos = listaItensPedidos;
	}

	
	
	
	
	
	//metodos
	
	public void adicionarItem(ItemCardapio d) {

	}

	public void removerItem(ItemCardapio c) {

	}

	public boolean calcularPrecoFinal() {

	}

}
