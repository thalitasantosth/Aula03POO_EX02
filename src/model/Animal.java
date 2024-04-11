package model;

public class Animal {
	
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private float velocidade;
	
	public Animal () {
		nome = null;
		comprimento = 0;
		patas = 4;
		cor = null;
		ambiente = null;
		velocidade = 0.0f;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public float getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public void alteraNome (String nome) {
		this.nome = nome;
		
	}
	
	public void alterarComprimento (int comprimento) {
		this.comprimento = comprimento;
		
	}
	
	public void alteraPata (int patas) {
		this.patas = patas;
		
	}
	
	public void alterarCor (String cor) {
		this.cor = cor;
		
	}

	public void alteraAmbiente (String ambiente) {
		this.ambiente = ambiente;
		
	}
	
	public void alteraVelocidade (float velocidade) {
		this.velocidade = velocidade;
		
	}
	
	public void dados () {
		System.out.println("Informações do animal ");
		System.out.println("Nome: " + nome);
		System.out.println("Comprimento: " + comprimento);
		System.out.println("Patas: " + patas);
		System.out.println("Cor: " + cor);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Velocidade: " + velocidade);
	}
}
