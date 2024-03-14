package ecommerce.model;

public abstract class Ecommerce {

	// Atributos / Caracteristicas

	// Encapsulamento: Encapsular/Proteger algo
	// Private / Protected / Public / Friendly

	private String produto;
	private String nome;
	private float preco;
	private int id;

	public Ecommerce(int id, String produto, String nome, float preco) {

		this.produto = produto;
		this.nome = nome;
		this.preco = preco;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void visualizar() {
		System.out.println("\n********************************");
		System.out.println("Informações do Produto:");
		System.out.println("********************************");
		System.out.println("ID: " + this.id);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço do produto: " + this.preco);
	}

}