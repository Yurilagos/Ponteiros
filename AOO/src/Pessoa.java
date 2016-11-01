
public class Pessoa {
	private String nome;
	private String enderešo;
	private String dataNascimento;
	
	public Pessoa(String nome, String enderešo, String dataNascimento) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
