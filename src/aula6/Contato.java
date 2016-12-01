package aula6;

public class Contato {
	
	private String nome;
	private String email;
	private Integer telefone;
	
	public Contato(String nome, String email, Integer telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	
	public String toString(){
		return this.nome;
	}
	
	

}
