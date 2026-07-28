package sistema;

public abstract class Pessoa {

	//atributos

	private String nome;

	private String cpf;

	private String telefone;

	
	
	
	//construtor
	
	public Pessoa(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	
	
	

	//gets e sets	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	//metodos
	
	public void validarCpf() {
		if (getCpf().length() != 11) {
			System.out.println("Este CPF é inválido!");
		}else {
			System.out.println("CPF válido!");

		}
		
	}

}
