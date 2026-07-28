package sistema;

import java.util.ArrayList;

public class Restaurante {


	//atributos

	private ArrayList <ItemCardapio> listaItensCardapio;
 
	
	
	
	//construtor

	public Restaurante() {
		super();
		listaItensCardapio = new ArrayList <>();

	}
	
	
	
	
	
	//gets e sets	

	public ArrayList<ItemCardapio> getListaItensCardapio() {
		return listaItensCardapio;
	}

	public void setListaItensCardapio(ArrayList<ItemCardapio> listaItensCardapio) {
		this.listaItensCardapio = listaItensCardapio;
	}



	
	
	
	
	
	//metodos

	public void listarPedidos() {
        for (ItemCardapio item : listaItensCardapio) {
            System.out.println(item);
        }
	}

	public void atualizarPrecoItem(ItemCardapio a, double novoPreco_fixo) {
		a.setPreco_fixo(novoPreco_fixo);
		System.out.println("Executado com sucesso!");
	}

	public void adicionarItemCardapio(String nome, double preco_fixo) {
		ItemCardapio item = new ItemCardapio(nome, preco_fixo);
		listaItensCardapio.add(item);
		System.out.println("Executado com sucesso!");
	}

	public void removerItemCardapio(ItemCardapio b) {
		
		if (listaItensCardapio.size() <= 0) {
			System.out.println("Não foi executado!");
			System.out.println("O cardápio não tem este item pois está vazio!");
			
		}else if(listaItensCardapio.contains(b) == false) {
			System.out.println("Não foi executado!");
			System.out.println("Este item não está no cardápio!");
		}else {
			listaItensCardapio.remove(b);
			System.out.println("Executado com sucesso!");
		
		}

	}
	
	public void getListaItensCardapioFormatada() {
		
		System.out.println("--- ITENS DISPONÍVEIS ---");
		
        for (int i = 0; i < (getListaItensCardapio()).size(); i++) {
            ItemCardapio item = (getListaItensCardapio()).get(i);
            System.out.println("[" + i + "] " + item.getNome() + " - R$ " + item.getPreco_fixo());
        }
	}
}
