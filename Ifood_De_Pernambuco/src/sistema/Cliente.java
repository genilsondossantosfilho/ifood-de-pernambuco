package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa {

	Scanner scanner = new Scanner(System.in);
	
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

	
	
	
	
	
	//metodos
	
	public void fazerPedido() {
		
		ArrayList<ItemCardapio> pedido = new ArrayList<>();
		
		boolean verdade = true;
		
		while (verdade == true) {
			verCardapio();
			
			System.out.println("Selecione o item pelo numero ou digite 666 pra encerrar seu pedido: ");
			int indicePedido = scanner.nextInt();
			
			if (indicePedido != 666) {
				ItemCardapio itemPedido = (getListaItensCardapio()).get(indicePedido);
				
				pedido.add(itemPedido);
			
			}else {
				verdade = false;
				System.out.println("Pedido feito com sucesso!");
			}
		}
		
	}

	public void verCardapio() {
		return getListaItensCardapioFormatada();

	}
	public void pedirPrecoTotal() {
		
	}
}
