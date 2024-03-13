package ecommerce.model;

public abstract class Ecommerce {
	
	// Atributos / Caracteristicas

		// Encapsulamento: Encapsular/Proteger algo
		// Private / Protected / Public / Friendly

	private String produto;
	private String nome;
	private float preco;
	public Ecommerce(String produto, String nome, float preco) {
		super();
		this.produto = produto;
		this.nome = nome;
		this.preco = preco;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}