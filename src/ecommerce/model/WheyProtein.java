package ecommerce.model;

public class WheyProtein extends Ecommerce {

	public WheyProtein (String produto, String nome, float preco) {
		super(produto, nome, preco);
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
