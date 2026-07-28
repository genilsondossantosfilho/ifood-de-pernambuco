public class ItemCardapio {

	//atributos

	private String nome;

	private double preco_fixo;

	
	
	
	
	//construtor
	
	public ItemCardapio(String nome, double preco_fixo) {
		super();
		this.nome = nome;
		this.preco_fixo = preco_fixo;
	}
	
	
	
	
	
	//gets e sets	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco_fixo() {
		return preco_fixo;
	}

	public void setPreco_fixo(double preco_fixo) {
		this.preco_fixo = preco_fixo;
	}

}
