package ecommerce.model;

public class Creatina extends Ecommerce {

	public Creatina(String produto, String nome, float preco) {
		super(produto, nome, preco);
		// TODO Auto-generated constructor stub
	}

	
	    private String nome;
	    private float preco;
	    private String marca;


	    // Métodos getters e setters
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

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	
}

