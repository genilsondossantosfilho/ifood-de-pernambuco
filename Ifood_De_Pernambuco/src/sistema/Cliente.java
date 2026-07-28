package sistema;

import java.util.ArrayList;

public class Cliente extends Pessoa {

	//atributos

	private Endereco endereco;
	
	
	
	
	
	//construtor
	
	public Cliente(String nome, String cpf, String telefone, String rua, String numero, String bairro, String cidade) {
		super(nome, cpf, telefone);
		Endereco endereco = new Endereco(rua, numero, bairro, cidade);
	}

	
	
	
	
	
	//gets e sets	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	
	
	n
	
	//metodos
	
	public void fazerPedido() {
		ItemCardapio pedido = new ArrayList <>();
		
		pedido.add(item);
	}

	public ArrayList <ItemCardapio> VerCardapio() {
		return getListaItensCardapio();

	}
	public void pedirPrecoTotal() {
		
	}
}
