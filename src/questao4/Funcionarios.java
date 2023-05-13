package questao4;

public class Funcionarios {

	private String nome;
	private String rg;
	private String cpf;
	public Funcionarios(String cpf, String rg, String nome) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
	}
	public Funcionarios() {
		super();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Funcionarios [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
	
}
